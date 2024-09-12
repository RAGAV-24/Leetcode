/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
        int m=0;

       while(l<r)
        {
            int z=l+(r-l)/2;
            if(isBadVersion(z))
            {
                r=z;
                
            }
            else
            {
                l=m+1;
            }

        }
        return l;
    }
}