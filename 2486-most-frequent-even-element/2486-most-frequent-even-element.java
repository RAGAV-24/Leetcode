class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        TreeMap<Integer,Integer> a=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
         a.put(nums[i],a.getOrDefault(nums[i],0)+1);
           }
         
        }
        int max=Integer.MIN_VALUE;
        for(int i:a.values())
        {
         if(max<i)
         {
            max=i;
         }
        }
        
        
        for(int i:a.keySet())
        {
            if(a.get(i)==max)
            {
                return i;
            }
        }
        return -1;
    }
}