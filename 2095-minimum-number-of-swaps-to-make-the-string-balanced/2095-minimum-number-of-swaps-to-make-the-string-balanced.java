class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>(); 
        
        for (char i : s.toCharArray())
        {
            if (i == '[')
            {
                st.push(i); 
            }
            else if (!st.isEmpty() && st.peek() == '[')
            {
                st.pop(); 
            }
            else
            {
                st.push(i); 
            }
        }
        
        int k = st.size() / 2;
        int r =  (int)Math.ceil(k / 2.0);
        return r;
    }
}