class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        
        // Dividing through each till we can
        for (int a : new int[]{2, 3, 5}) {
            while (n % a == 0)
                n/= a;
        }
        
        // If n==1 then no factor left
        return n == 1;
    }
}
