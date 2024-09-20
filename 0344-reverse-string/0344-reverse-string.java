class Solution {
    public void reverseString(char[] s) {
    //    if(s.length%2==1)
    //    {
         for(int i=0;i<(s.length)/2;i++)
        {
            char f=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=f;

        }
    //    }
    //    else
    //    {for(int i=0;i<(s.length)/2;i++)
    //     {
    //         char f=s[i];
    //         s[i]=s[s.length-1-i];
    //         s[s.length-1-i]=f;

    //     }

    //    }
    }
}