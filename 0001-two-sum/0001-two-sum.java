class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ne=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int r=target-nums[i];
            if(ne.containsKey(r))
            {
                return new int[]{ne.get(r),i};
            }
            ne.put(nums[i],i);
        }
        return new int[]{};
    }
}