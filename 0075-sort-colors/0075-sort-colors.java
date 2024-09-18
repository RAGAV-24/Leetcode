class Solution {
    public void sortColors(int[] nums) {
      
        // int n=nums.length;
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]>nums[j])
        //         {
        //             int t=nums[j];
        //             nums[j]=nums[i];
        //             nums[i]=t;

        //         }
        //     }
       
        // }
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums)
        // {
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int k=0;
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<map.getOrDefault(i,0);j++)
        //     {
        //         nums[k]=i;
        //         k++;
        //     }

        // }
        int l=0;
        int m=0;
        int h=nums.length-1;
       
        while(m<=h)
        {
            if(nums[m]==0)
            {
                int t=nums[m];
                nums[m]=nums[l];
                nums[l]=t;
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                int t=nums[h];
                nums[h]=nums[m];
                nums[m]=t;
                h--;
            }
        }


    }
}