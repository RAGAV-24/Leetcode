class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:set)
        {
            arr.add(i);
        }
        Collections.sort(arr);
        if(arr.size()<=2)
        {
            return arr.get(arr.size()-1);
        }
        return arr.get(arr.size()-3);
    }
}