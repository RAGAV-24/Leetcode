class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
        if(k==0)
        {
         return arr;
        }
      if(k>0) { for(int i=0;i<code.length;i++)
        {
            int s=0;
            for(int j=1;j<=k;j++)
            {
                s+=code[(i+j)%code.length];
            }
            arr[i]=s;
        }}
        else
        {
            for(int i=0;i<code.length;i++)
            {
                int s=0;
                for(int j=1;j<=-1*k;j++)
                {
                    s+=code[((i-j)+code.length)%code.length];
                }
                arr[i]=s;
            }
        }
        return arr;
        
    }
}