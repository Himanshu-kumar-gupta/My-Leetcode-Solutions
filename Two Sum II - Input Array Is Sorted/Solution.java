class Solution {
    public int[] twoSum(int[] numbers, int target) {        
        
        int f=0,l=numbers.length-1;
        int sum=numbers[f]+numbers[l];
        
        while(sum!=target){         
            if(numbers[f]+numbers[l]<target)
                f++;
            else
                l--;
            sum=numbers[f]+numbers[l];
        }
        
        int res[]={f+1,l+1};
        return res;
    }
}
