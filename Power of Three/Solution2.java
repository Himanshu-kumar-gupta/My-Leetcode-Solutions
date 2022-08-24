class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        //If it is power of 3 it should divide 3^19
        return ( n>0 &&  1162261467%n==0);
    }
}
