class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char a:allowed.toCharArray())
        {
            set.add(a);
        }
        int c=0;
        for(String a:words)
        {
            boolean b=true;
            for(char t:a.toCharArray())
            {
                if(!set.contains(t))
                {
                    b=false;
                }
            }
            if(b==true)
            {
             c=c+1;
            }

        }
        return c;
    }
}