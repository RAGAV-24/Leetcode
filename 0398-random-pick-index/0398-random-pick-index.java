class Solution {
    int[] nums;
    public Random r=new Random();
    public Solution(int[] nums) {
        this.nums=nums;

    }
    
    public int pick(int target) {
        int re=-1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                c=c+1;
                if(r.nextInt(c)==0)
                {
                    re=i;
                }
            }
        }
        return re;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */