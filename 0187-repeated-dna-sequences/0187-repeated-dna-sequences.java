class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> arrl=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String str=s.substring(i,i+10);
            if(!set.contains(str))
            {
                set.add(str);
            }
            else
            {
             arrl.add(str);
            }
        }
        ArrayList<String> arrli=new ArrayList<>(arrl);
        return arrli;
    }
}