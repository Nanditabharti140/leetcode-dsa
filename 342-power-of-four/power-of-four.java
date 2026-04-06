class Solution {
    public boolean isPowerOfFour(int n) {
        return isPowerOfTwo(n) && isPerfectSquare(n);
        // Method 1
        // if(n == 1) return true;
        // if(n < 1) return false;
        // if(n % 4 != 0) return false;
        // return isPowerOfFour(n / 4);
    }
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
    public boolean isPerfectSquare(int n){
        int root = (int) Math.sqrt(n);
        return (root*root) == n;
    }
}