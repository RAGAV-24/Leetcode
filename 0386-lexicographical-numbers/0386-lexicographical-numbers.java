class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String a=Integer.toString(i);
            System.out.println(a);
            arr.add(a);
        }
        Collections.sort(arr);
        List<Integer> arr1=new ArrayList<>();
        for(String f:arr)
        {
            arr1.add(Integer.parseInt(f));
        }
        return arr1;
        
    }
}