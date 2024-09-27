class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int r=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int l=0;
                while(i+l<nums1.length&& j+l<nums2.length && nums1[i+l]==nums2[j+l])
                {
                    l++;
                }
                r=Math.max(l,r);
            }
        }
        return r;
    }
}