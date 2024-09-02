class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long t = 0;
         for (int i = 0; i < chalk.length; i++) {
            t += chalk[i];
        }
         k = (int)(k % t);
        
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        
        return -1; 
    }
}