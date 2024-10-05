class Solution {
    public String sor(String a)
    {
      char[] arr=a.toCharArray();
      Arrays.sort(arr);
      return new String(arr);
    }
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        if(b<a)
        {
            return false;
        }
        String str=sor(s1);
        for(int i=0;i<=b-a;i++)
        {
            String r=sor(s2.substring(i,i+a));
            if(r.equals(str))
            {
                return true;
            }
        }
        return false;
    }
}