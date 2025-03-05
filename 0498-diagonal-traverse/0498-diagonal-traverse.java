import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
         for(int i=0;i<mat.length;i++)
         {
            for(int j=0;j<mat[0].length;j++)
            {
                int sum=i+j;
                if(!map.containsKey(sum))
                {
                    map.put(sum,new ArrayList<>());
                }
                map.get(sum).add(mat[i][j]);
            }
         }
         int[] res=new int[mat.length*mat[0].length];
         int ri=0;
   int odd=0;
         for(int i:map.keySet())
         {
            if(odd%2==0)
            {
                ArrayList<Integer> arri=map.get(i);
                Collections.reverse(arri);
            for(int j:arri)
            {
                res[ri]=j;
                ri++;
                
            }
         
            }
            else
            {
            for(int j:map.get(i))
            {
               res[ri]=j;
               ri++;
            }
           
            }
            odd++;
            

         }
         return res;
    }
}