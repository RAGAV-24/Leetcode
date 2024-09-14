class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m=1;
        int[] l=new int[nums.length];
        int[] r=new int[nums.length];
        l[0]=1;
        r[nums.length-1]=1;
        for (int i = 0, j = nums.length - 1; i < nums.length - 1 && j > 0; i++, j--) {
    l[i + 1] = l[i] * nums[i];
    r[j - 1] = r[j] * nums[j];
}

       for(int i=0;i<nums.length;i++)
       {
        nums[i]=l[i]*r[i];
       }
        return nums;
    }
}