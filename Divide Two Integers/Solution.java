class Solution {
    public int divide(int dividend, int divisor) {
        
        long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; 
        long dividend1 = Math.abs((long)dividend); 
        long divisor1 = Math.abs((long)divisor); 
        long quotient = 0, temp = 0; 
        
        for (int i = 31; i >= 0; --i) {
            if (temp + (divisor1 << i) <= dividend1) { 
                temp += divisor1 << i; 
                quotient |= 1L << i; 
            } 
        }
        
        if(sign * quotient>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return (int)(sign * quotient); 
    }
    
}
