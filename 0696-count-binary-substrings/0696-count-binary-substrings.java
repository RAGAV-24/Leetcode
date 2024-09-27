class Solution {
    public int countBinarySubstrings(String s) {
     int c=1;
     List<Integer> arr=new ArrayList<>();
     for(int i=1;i<s.length();i++)
     {
        if(s.charAt(i)==s.charAt(i-1))
        {
            c=c+1;
        }
        else
        {
            arr.add(c);
            c=1;
        }
     }
     arr.add(c);
     int ans=0;
     for(int i=1;i<arr.size();i++)
     {
        ans+=Math.min(arr.get(i-1),arr.get(i));
     }
    return ans;
    }
}