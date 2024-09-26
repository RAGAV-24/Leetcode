class Solution {
    public int thirdMax(int[] nums) {
       long a=Long.MIN_VALUE;
       long b=Long.MIN_VALUE;
       long c=Long.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>a)
        {
           c=b;
           b=a;
           a=nums[i];
        }
        else if(nums[i]>b&&a>nums[i])
        {

            c=b;
            b=nums[i];
        }
        else if(nums[i]>c && b>nums[i])
        {
            c=nums[i];
        }
       }
       return c!=Long.MIN_VALUE?(int)c:(int)a;
    }
}