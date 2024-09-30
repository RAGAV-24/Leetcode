import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
    
    BigInteger[] arr=new BigInteger[nums.length];
    int fg=0;
    for(String b:nums)
    {
    arr[fg]=new BigInteger(b);
    fg++;
    }
    Arrays.sort(arr);
     return arr[arr.length-k].toString();
    }
}