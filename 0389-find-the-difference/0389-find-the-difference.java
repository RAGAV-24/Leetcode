class Solution {
    public char findTheDifference(String s, String t) {
        int t_sum=0;
        int s_sum=0;
        for(char c:s.toCharArray())
        {
            s_sum+=c;
        }
        for(char c:t.toCharArray())
        {
            t_sum+=c;
        }
        return (char)(t_sum-s_sum);
    }
}