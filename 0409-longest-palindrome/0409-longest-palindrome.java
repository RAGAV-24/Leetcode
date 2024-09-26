class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char f:s.toCharArray())
        {
            map.put(f,map.getOrDefault(f,0)+1);
        }
        int c=0;
       
       int r=0;
        for (int f: map.values()) {
            if (f % 2 == 0) {
                
                c += f;
            } else {
                if(r==0)
                {
                c += f;
                
                r = 1;
                }
                else 
                {
              c+=f-1;
                }
            }
        }
    
       return c;
    }
}