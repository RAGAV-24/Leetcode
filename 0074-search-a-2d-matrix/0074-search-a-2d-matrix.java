class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
                if(matrix[i][j]>target)
                {
                     k=k+1;
                    break;
                   
                }
            }
            if(k==1)
            {
                break;
            }
        }
        return false;
    }
}