class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left ;i<=right;i++)
        {
            if(prime(i))
            {
                arr.add(i);
            }
        }
        int[] arr1=new int[2];
        Collections.sort(arr);
        
        if(arr.size()<=1)
        {
        arr1[0]=-1;
        arr1[1]=-1;
        return arr1;
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                arr1[0] = arr.get(i - 1);
                arr1[1] = arr.get(i);
            }
        }
        return arr1;
    }
    public boolean prime(int a)
    {
        if(a<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }

        }
        return true;
    }
}