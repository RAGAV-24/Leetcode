class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> arr=new ArrayList<>();
        int t=0;
        int l=0;
        int b=m.length-1;
        int r=m[0].length-1;
        while(l<=r &&t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                arr.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                arr.add(m[i][r]);
            }
            r--;
          if(t<=b)
          {
            for(int i=r;i>=l;i--)
            {
                arr.add(m[b][i]);
            }
            b--;
          }
          if(l<=r)
          {
            for(int i=b;i>=t;i--)
            {
                arr.add(m[i][l]);
            }
            l++;
          }

        }
        return arr;

    }
}