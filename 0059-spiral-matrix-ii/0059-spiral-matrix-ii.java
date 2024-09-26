class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int[][] arr2=new int[n][n];
        int l=0,t=0;
        int r=n-1,b=n-1;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                arr2[t][i]=k++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                arr2[i][r]=k++;
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    arr2[b][i]=k++;
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    arr2[i][l]=k++;
                }
                l++;
            }



        }
        return arr2;
    }
}