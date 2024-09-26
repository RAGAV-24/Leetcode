class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length &&j<nums2.length){
            if(nums1[i]==nums2[j])
            {
                arr[k++]=nums1[i];
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                i++;
            }

        }
        return Arrays.copyOf(arr,k);
        
    }
}