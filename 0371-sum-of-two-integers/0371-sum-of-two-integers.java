class Solution {
    public int getSum(int a, int b) {
       while(b!=0)
       {
        int c=0;
        c=a&b;
        a=a^b;
        b=c<<1;
        System.out.println(c+" "+a+" "+b);
       }
     return a;
    }
}