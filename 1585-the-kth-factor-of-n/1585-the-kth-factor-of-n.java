class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                a.add(i);
            }
        }
            if (k <= a.size()) {
            return a.get(k - 1);
        }
        
        return -1;
    }
}