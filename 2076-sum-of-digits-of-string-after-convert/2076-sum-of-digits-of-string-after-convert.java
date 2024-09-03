class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i)-'a';
            str.append(a+1);
        }
        String t=str.toString();
        char[] arr=t.toCharArray();
        int sum=0;
        for(char b:arr)
        {
      sum=sum+(b-'0');
        }
     
        if(k==1)
        {
            return sum;
        }
        k=k-1;
        while(k>0 && sum>9)
        {
            int p=0;
        while(sum>0)
        {
            int rem=sum%10;
            p=p+rem;
            sum/=10;
        }
       sum=p;
        k=k-1;
        }
        return sum;
    }
}