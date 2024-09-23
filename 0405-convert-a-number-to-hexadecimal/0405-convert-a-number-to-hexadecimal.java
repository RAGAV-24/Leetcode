class Solution {
    public String toHex(int num) {
       if(num==0)
        return "0";
       long v=num;
       if(v<0)
         v=(long)(Math.pow(2,32)+num);
        StringBuilder sb=new StringBuilder();
        while(v!=0)
        {
            int rem=(int)(v%16);
            v=v/16;
            if(rem>=10)
            {
                sb.append((char)(87+rem));
            }
            else
            {
                sb.append(rem);
            }
        }
        return sb.reverse().toString();
    }
}