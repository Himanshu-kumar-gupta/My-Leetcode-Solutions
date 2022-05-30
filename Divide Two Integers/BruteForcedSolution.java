class Solution {
    public int divide(int dividend, int divisor) {

        long dd=dividend;
        long ds=divisor;
        int mulF=1;

        if (dd<0){
            dd*=-1;
            mulF=-1;
        }

        if (ds<0){
            ds*=-1;
            mulF*=-1;
        }

        if (dd==ds)
            return mulF;

        long count=0;

        while (dd>ds){
            if (mulF ==-1 && count*mulF<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            if (mulF==1 && count>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            dd-=ds;
            count++;
        }

        if (mulF==-1)
            count*=mulF;

        return (int) count;
    }
    
}
