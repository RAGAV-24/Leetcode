class Solution {
    public int searchInsert(int[] nums, int target) {
        int r=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
            return i;
            }
            r=i;
        }
        return r+1;

    }
}