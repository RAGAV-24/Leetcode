class Solution {
    public int search(int[] arr, int t) {
        int c=Integer.MIN_VALUE;
        int l=0;
        int r=arr.length-1;
        if(r==0 && arr[r]==t)
        {
            return 0;

        }
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==t)
            {
                return mid;
            }
            else if(arr[mid]<t)
            {
                l=mid+1;
            }
            else if(arr[mid]>t)
            {
                r=mid-1;
            }

        }
        return -1;
    }
}