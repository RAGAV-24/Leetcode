class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
       List<List<Integer>> aa=new ArrayList<>();
       List<Integer>  a=new ArrayList<>();
       int g=0;
       func(g,c,aa,a,t);
       return aa;
        
    }
    public void func(int ind,int[] c,List<List<Integer>> ll,List<Integer> l,int t)
    {
        if(ind==c.length)
        {
            if(t==0)
            {
                ll.add(new ArrayList<>(l));
            }
            return ;
        }
        if(c[ind]<=t)
        {
            l.add(c[ind]);
            func(ind,c,ll,l,t-c[ind]);
            l.remove(l.size()-1);
        }
        func(ind+1,c,ll,l,t);
    }
}