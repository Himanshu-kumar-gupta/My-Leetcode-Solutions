class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) 
            return false;
        double power = Math.log10(n)/Math.log10(3);
        return power%1==0; //Checking if integer or not
    }
}
