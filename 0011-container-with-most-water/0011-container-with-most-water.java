class Solution {
    public int maxArea(int[] height) {
       int n=height.length-1;
       int l=0;
       int r=n;
       int tar=0;
       while(l<=r)
       {
        int w=Math.abs(l-r);
        int h=Math.min(height[l],height[r]);
        int max=w*h;
        tar=Math.max(max,tar);
        if(height[l]<height[r])
        {
            l++;
        }
        else
        {
            r--;
        }

       }
       return tar;
        
    }
}