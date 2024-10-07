class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        char[] arr=s.toCharArray();
        int j=0;
        if(s.length()<=2)
        {
        return "";
        }   
         for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='(')
            {
                j++;
                if(j>1)
                {
                    str.append(arr[i]);
                }
            }
            else
            {
                if(j>1)
                {
                    str.append(arr[i]);
                    
                }
                j--;
            }
        }
        return str.toString();
    }
}