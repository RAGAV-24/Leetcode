class Solution {
    public boolean predictTheWinner(int[] nums) {
    int n=nums.length-1;
     return  score(nums,0,n)>=0;
    }
    public static int score(int[] nums,int l,int r)
    {
   if(l==r)
   {
    return  nums[l];
   }
   int pl=nums[l]-score(nums,l+1,r);
   int pr=nums[r]-score(nums,l,r-1);
   return Math.max(pl,pr);
    }
}