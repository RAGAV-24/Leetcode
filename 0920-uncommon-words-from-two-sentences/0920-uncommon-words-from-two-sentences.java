class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String re=s1+" "+s2;
        Map<String,Integer> str=new HashMap<>();
        for(String b:re.split(" "))
        {
               str.put(b,str.getOrDefault(b,0)+1);
        }
        ArrayList<String> res=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(String b:re.split(" "))
        {
            set.add(b);
        }
        for(String b:set)
        {
            if(str.get(b)<2)
            {
                res.add(b);
            }
        }
        String[] sa = new String[res.size()];
        sa = res.toArray(sa);
        return sa;

    }
}