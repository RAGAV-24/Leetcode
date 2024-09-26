class Solution {
    public char findTheDifference(String s, String t) {
        int si=0;
        for(char a:t.toCharArray())
        {
            si=si+a;
        }
        int to=0;
        for(char a:s.toCharArray())
        {
            to=to+a;
        }
        System.out.println(si+" "+to);
        return (char)(si-to);
    }
}