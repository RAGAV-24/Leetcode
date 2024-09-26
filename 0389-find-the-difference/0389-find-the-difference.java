class Solution {
    public char findTheDifference(String s, String t) {
        int si=0;
        for(char a:t.toCharArray())
        {
            si=si+a;
        }
        for(char a:s.toCharArray())
        {
            si=si-a;
        }
        
        return (char)(si);
    }
}