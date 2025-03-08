class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bl=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++)
        {
            if(i-k>=0 && blocks.charAt(i-k)=='B')
            bl--;
            if(blocks.charAt(i)=='B')
            {
                bl++;
            }
            ans=Math.min(ans,k-bl);
        }
        return ans;

    }
}