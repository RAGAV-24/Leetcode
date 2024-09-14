class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
    //    if(n==1)
    //    {
    //     return arr[0];
    //    }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(max<sum)
          {
            max=sum;
          }
          if(sum<0)
          {
            sum=0;
          }
          
        }
        return max;
    }
}