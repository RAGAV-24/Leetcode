class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> arr=new HashSet<>();
        ArrayList<String> f=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String fr=s.substring(i,i+10);
            if(!arr.contains(fr))
            {
                arr.add(fr);
            }
            else if(!f.contains(fr))
            {
                f.add(fr);
            }

        }
        return f;
    }
}