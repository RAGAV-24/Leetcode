/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0;
        int r=n;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(0==guess(m))
            {
                return m;
            }
            else if(-1==guess(m))
            {
                r=m-1;
            }
        
            else
                l=m+1;
        
           
        }
        return 0;
    }
}