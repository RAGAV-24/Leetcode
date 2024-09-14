class Solution {
    public boolean canJump(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>r)
            {
                return false;
            }
            int a=i+nums[i];
            r=Math.max(r,a);
            if(r>=nums.length-1)
            {
                return true;
            }

        }
        return true;
    }
}