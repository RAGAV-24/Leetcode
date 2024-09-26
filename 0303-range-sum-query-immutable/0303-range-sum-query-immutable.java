class NumArray {
    public int[] arr;

    public NumArray(int[] nums) {
        arr=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            arr[i]=s;
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return arr[right];
        } else {
            return arr[right] - arr[left - 1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */