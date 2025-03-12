class Solution {
    public String reverseWords(String s) {
        String arr="";
    
        String[] arr1=s.trim().split("\\s+");
        for(int i=arr1.length-1;i>=0;i--)
        {
            
            arr+=arr1[i];
            if(i!=0)
            arr+=" ";
        }
        return arr;
    }
}