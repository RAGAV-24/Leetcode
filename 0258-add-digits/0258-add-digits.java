class Solution {
    public int addDigits(int num) {
        if(num==0)
        {
            return 0;

        }
        int result=0;
        while(num>9)
        {
            int n=0;
            while(num>0)
            {
                int rem=num%10;
                n=n+rem;
                num=num/10;
            }
           num=n;
        }
        return num;
    }
}