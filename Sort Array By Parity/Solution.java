class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < nums.length ; i++)
            if (nums[i]%2==0)
                odd.add(nums[i]);
            else
                even.add(nums[i]);

        odd.addAll(even);

        for (int i = 0; i < nums.length ; i++)
            nums[i]= odd.get(i);

        return nums;
    }
}
