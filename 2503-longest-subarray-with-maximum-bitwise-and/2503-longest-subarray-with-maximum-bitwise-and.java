class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        for(int i:nums)
        {
        max=Math.max(max,i);
        }
        int c=0;
        int k=0;
        for(int i=0;i<n;i++)
        {

            if(max==nums[i] )
            {
                c=c+1;
                k=Math.max(k,c);
            }
            else
            {
               c=0;
            }
        }
        return k;
    }
}