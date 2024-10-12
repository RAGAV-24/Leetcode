class Solution {
    public List<Integer> majorityElement(int[] nums) {
 List<Integer> a=new ArrayList<>();
        Map<Integer,Integer> b=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            b.put(nums[i],b.getOrDefault(nums[i],0)+1);
        }
        int r=nums.length/3;
        for(int i=0;i<nums.length;i++)
        {
            if(b.get(nums[i])>r && !a.contains(nums[i]))
            {
               a.add(nums[i]);
            }
        }
        return a;
    }
}