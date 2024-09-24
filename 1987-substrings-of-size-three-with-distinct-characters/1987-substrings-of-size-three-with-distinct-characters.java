class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++)
        {
           StringBuilder arr=new StringBuilder(s.substring(i,i+3));
           char[] ar=arr.toString().toCharArray();
        int f=0;
        for(int j=0;j<1;j++)
        {
            if(ar[0] != ar[1] && ar[1] != ar[2] && ar[0] != ar[2])
            {
                f=f+1;
            }

        }
        if(f==1)
        {
            c=c+1;
        }
        }
        return c;
    }
}