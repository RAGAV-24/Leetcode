class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> ee=new TreeSet<>();
       for(int i:nums)
       {
        ee.add(i);
       }
       if(ee.size()>2)
       {
        ee.pollLast();
        ee.pollLast();
       }
       return ee.last();
    }
}