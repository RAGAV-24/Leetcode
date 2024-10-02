class Solution {
    public int[] arrayRankTransform(int[] arr) {
    TreeSet<Integer> arr1=new TreeSet<>();
    for(int i:arr)
    {
       arr1.add(i);
    }
    HashMap<Integer,Integer> map=new HashMap<>();
     int k=1;
    for(int i:arr1)
    {
        map.put(i,map.getOrDefault(i,0)+k);
        k++;
    }
    int i=0;
    for(int j:arr)
    {
     arr[i]=map.get(j);
     i++;
    }
    return arr;
    }
}