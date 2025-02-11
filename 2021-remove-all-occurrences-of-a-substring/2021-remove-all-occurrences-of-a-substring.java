class Solution {
    public String removeOccurrences(String s, String part) {
        int le=s.length();
        int n=s.indexOf(part);
        while(n!=-1)
        {
            s=s.substring(0,n)+s.substring(n+part.length());
            n=s.indexOf(part);
        }
        return s;
    }
}