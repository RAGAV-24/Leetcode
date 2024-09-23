class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> arr1=new HashSet<>();
        for(String i:bannedWords)
        {
            arr1.add(i);
        }
        int c=0;
        for(String i:message)
        {
            if(arr1.contains(i))
            {
                c=c+1;
            }
        }
        if(c>=2)
        {
            return true;
        }
        return false;

    }
}