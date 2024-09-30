class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int c=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
        
   if(arr[i]==1)
   {
    c=c+1;
    max=Math.max(max,c);

   }
   else
   {
    c=0;
   }
        }
        return max;
    }
}