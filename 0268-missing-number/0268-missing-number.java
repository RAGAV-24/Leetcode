class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
            {
                return i;
            }
            k=nums[i];
        }
        return k+1;
    }
}