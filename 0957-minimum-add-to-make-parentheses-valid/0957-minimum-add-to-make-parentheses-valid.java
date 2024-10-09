class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> a=new Stack<>();
        int r=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                a.push(c);
            }
            else if(a.isEmpty())
            {
                r=r+1;
            }
            else
            {
                a.pop();
            }
        }
        return r+a.size();
    }
}