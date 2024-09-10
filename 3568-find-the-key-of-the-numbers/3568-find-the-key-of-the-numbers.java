class Solution {
    public int generateKey(int num1, int num2, int num3) {
       String a=Integer.toString(num1);
       String b=Integer.toString(num2);
       String c=Integer.toString(num3); 
       int ac=a.length();
       int bc=b.length();
       int cc=c.length();
       StringBuilder as=new StringBuilder();
       StringBuilder bs=new StringBuilder();
       StringBuilder cs=new StringBuilder();
       for(int i=0;i<4-ac;i++)
       {
        as.append("0");
       }
       as.append(a);
       for(int i=0;i<4-bc;i++)
       {
        bs.append("0");
       }
       bs.append(b);
       for(int i=0;i<4-cc;i++)
       {
        cs.append("0");
       }
       cs.append(c);
       a=as.toString();
       b=bs.toString();
       c=cs.toString();
       int result=0;
       for(int i=0;i<4;i++)
       {
        int h=a.charAt(i)-'0';
        int g=b.charAt(i)-'0';
        int f=c.charAt(i)-'0';
        System.out.println(h +" "+g+" "+f);
        int rem=Math.min(Math.min(h,g),f);
        result=result*10+rem;


       }
       return result;
    }
}