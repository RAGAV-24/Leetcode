class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char f:s.toCharArray())
        {
            map.put(f,map.getOrDefault(f,0)+1);
        }
        int c=0;
       for(char a:map.keySet())
       {
        if(map.get(a)%2==0)
        {
            c=c+map.get(a);
        }
       }
       
       int r=0;
       for(char a:map.keySet())
       {
        
         if(map.get(a)%2==1  &&r==0)
        {
            
            c=c+map.get(a);
            r=1;
        }
        else if(map.get(a)%2==1  &&r==1)
        {
            
            c=c+map.get(a)-1;
            
        }
       }
    
       return c;
    }
}