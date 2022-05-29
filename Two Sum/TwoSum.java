public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];
        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++)
                if (nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }

        return null;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        TwoSum obj= new TwoSum();
        int abc[]=obj.twoSum(arr,9);

        for (int i = 0; i < abc.length ; i++)
            System.out.println(abc[i]);
    }
}
