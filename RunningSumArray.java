public class RunningSumArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length ; i++)
            nums[i]+=nums[i-1];

        return nums;
    }

    public static void main(String[] args) {
        int[] inp={3,1,2,10,1};
        RunningSumArray obj = new RunningSumArray();
        int[] res = obj.runningSum(inp);

        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }
}
