class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr=new int[r][c];
        List<Integer> arr1=new ArrayList<Integer>();
        if(mat.length*mat[0].length!=r*c)
        {
            return mat;
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr1.add(mat[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=arr1.get(k);
                k++;
            }
        }
        return arr;
    }
}