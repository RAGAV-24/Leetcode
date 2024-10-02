class Solution {
    public boolean isIsomorphic(String s, String t) {
     HashMap<Character,Character> cc=new HashMap<>();
     HashSet<Character> set=new HashSet<>();
     if(s.length()!=t.length())
     {
        return false;
     }
     for(int i=0;i<s.length();i++)
     {
        char a=s.charAt(i);
        char b=t.charAt(i);
        if(!cc.containsKey(a))
        {
            if(set.contains(b))
            {
                return false;
            }
            cc.put(a,b);
            set.add(b);
        }
        else
        {
            if(b!=cc.get(a))
            {
                return false;
            }
        }

     }   
     return true;
    }
}