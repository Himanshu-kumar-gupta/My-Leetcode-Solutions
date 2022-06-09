//All test cases are passed but time limit exceeded
//Previous solution using binary search

class Solution {
    public int[] twoSum(int[] numbers, int target) {        
        
        if(numbers.length==2 || target<=numbers[0] || target<numbers[1])
            if(numbers[0]+numbers[1]==target){
                int[] res={1,2};
                return res;
            }
            else
                return null;
        
        int f=0,l=numbers.length-1;
        int pivot=-1;
        
        System.out.println("r1");
        if(numbers[numbers.length-1]<target)
            pivot = numbers.length;
        
        if(pivot==-1)
            while(f<=l){
                int mid=(f+l)/2;
                if(numbers[mid]==target){
                    pivot=mid+1;
                    break;
                }             
                else if(target>numbers[mid]){
                    if(target<numbers[mid+1]){
                        pivot=mid+1;
                        break;
                    }
                    f=mid+1;
                }
                else if(target<numbers[mid]){
                    if(target>numbers[mid-1]){
                        pivot=mid;
                        break;
                    }
                    l=mid-1;
                }
            }
        
        for (int i = 0; i < pivot; i++)
            for (int j = i+1; j < pivot; j++)
                if (numbers[i]+numbers[j]==target){
                    int[] res={i+1,j+1};
                    return res;
                }

        return null; 
    }
}
