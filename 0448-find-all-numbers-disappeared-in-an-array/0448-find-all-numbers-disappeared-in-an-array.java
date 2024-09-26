class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i:nums)
        {
            arr.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!arr.contains(i))
            {
                b.add(i);
            }
        }
    return b;
    }
}