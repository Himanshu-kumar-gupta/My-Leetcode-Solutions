class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count=0;
        int max=0,pos=0,temp=0,r=0;
        
        for(int k=0;k<boxTypes.length;k++){
            for(int i=0;i<boxTypes.length;i++) {
                temp = boxTypes[i][1];
                if(temp>max) {
                    max=temp;
                    pos=i;
                }
            }
            
            if(truckSize<=boxTypes[pos][0]){
                count+=truckSize*boxTypes[pos][1];
                return count;
            }
            else{
                count+=boxTypes[pos][0]*boxTypes[pos][1];
                truckSize-=boxTypes[pos][0];
            }
            
            boxTypes[pos][0]=0;
            boxTypes[pos][1]=0; 
            max=0;
        }
        
        return count;                    
    }
}
