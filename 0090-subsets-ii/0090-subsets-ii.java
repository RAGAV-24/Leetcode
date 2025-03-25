class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        add(l,ll,nums,0);
        return ll;
    }
    public void add(List<Integer> l,List<List<Integer>> ll,int[] nums,int i)
    {
        if(nums.length==i)
        {
           List<Integer> kk=new ArrayList<>(l);
            Collections.sort(kk);
           if(!ll.contains(kk))
           {
           
            ll.add(kk);
           }
            return;
        }
        l.add(nums[i]);
        add(l,ll,nums,i+1);
        l.remove(l.size()-1);
        add(l,ll,nums,i+1);
    }
}