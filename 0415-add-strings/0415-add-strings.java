class Solution {
    public String addStrings(String num1, String num2) {
     StringBuilder str=new StringBuilder();
     int i=num1.length()-1;  
     int j=num2.length()-1;  
     int c=0;
     int s=0;
     while(i>=0||j>=0||c>0)
     {
        int f=(i>=0)?num1.charAt(i)-'0':0;
        int g=(j>=0)?num2.charAt(j)-'0':0;
         i--;
         j--;
         s=f+g+c;
         str.append(s%10);
         c=s/10;
     }
     return str.reverse().toString();
    }
}