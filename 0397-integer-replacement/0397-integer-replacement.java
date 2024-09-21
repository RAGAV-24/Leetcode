class Solution {
    public int integerReplacement(int n) {
        return f((long)n, 0);
    }

    public int f(long a, int s) {
        if (a == 1) {
            return s;  
        } 
        else if (a % 2 == 0) {
            return f(a / 2, s + 1);
        } 
        else {
            return Math.min(f(a - 1, s + 1), f(a + 1, s + 1));
        }
    }
}
