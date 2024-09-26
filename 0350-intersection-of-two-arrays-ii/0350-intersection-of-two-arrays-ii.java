class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[j]==nums2[i] && nums2[i]!=-1 &&nums1[j]!=-1)
                {
                    arr.add(nums2[i]);
                    nums1[j]=-1;
                    nums2[i]=-1;
                }

            }
        }
        int[] arr1=new int[arr.size()];
        int j=0;
        for(int i:arr)
        {
        arr1[j]=i;
        j++;
        }
        return arr1;
        
    }
}