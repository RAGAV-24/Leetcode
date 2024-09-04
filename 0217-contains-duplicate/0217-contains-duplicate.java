class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:nums)
        {
            if(m.get(i)>=2)
            {
                return true;
            }
        }
        return false;
    }
}