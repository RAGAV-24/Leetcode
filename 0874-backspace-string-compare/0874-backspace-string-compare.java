class Solution {
    public boolean backspaceCompare(String s, String t) {

    String s1=stacj(s);
    String t2=stacj(t);
    if(s1.equals(t2))
    {
        return true;
    }
  
        return false;
   
    }
    public static String stacj(String f)
    {
            Stack<Character> g=new Stack<>();
        for(int i=0;i<f.length();i++)
        {
            if(f.charAt(i)!='#')
            {
                g.push(f.charAt(i));
                
            }
            else if(!g.isEmpty())
            {
                g.pop();
            }

        }
         StringBuilder res = new StringBuilder();
        for(char c : g){
            res.append(c);
        }
        return res.toString();
    }
}