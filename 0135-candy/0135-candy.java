class Solution {
    public int candy(int[] nums) {
        int n=nums.length;
        int c = 0;
        int[] c1=new int[n];
        int[] c2=new int[n];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                c1[i]=c1[i-1]+1;
            }
             if (nums[n-1-i] > nums[n-i]) {
                c2[n-1-i] = c2[n-i]+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            c+=Math.max(c1[i],c2[i]);
        }
        return c+n;
        
    }
}