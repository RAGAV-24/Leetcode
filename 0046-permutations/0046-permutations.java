class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ll=new ArrayList<>();
        boolean[] bo=new boolean[nums.length];
        rec(ll,l,nums,bo);
        return ll;
    }
    public void rec(List<List<Integer>> ll,List<Integer> l,int[] nums,boolean[] bo)
    {
        if(l.size()==nums.length)
        {
         ll.add(new ArrayList<>(l));
         return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!bo[i])
            {
                l.add(nums[i]);
                bo[i]=true;
                rec(ll,l,nums,bo);
                l.remove(l.size()-1);
                bo[i]=false;

            }
        }
    }

}
