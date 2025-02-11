class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        String c=""; 
        if(n2>n1)
        {
            for(int i=0;i<n1;i++)
            {
                c+=word1.charAt(i);
                c+=word2.charAt(i);

            }
            c+=word2.substring(n1);
          
        }
        else if(n2==n1)
        {
            for(int i=0;i<n1;i++)
            {
                c+=word1.charAt(i);
                c+=word2.charAt(i);

            }
          
        }
        else
        {
            for(int i=0;i<n2;i++)
            {
                c+=word1.charAt(i);
                c+=word2.charAt(i);

            }
            c+=word1.substring(n2);
        }
        return c;
    }
}