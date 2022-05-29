public class RemoveDuplicateSort {
    public int removeDuplicates(int[] nums) {
        int min=nums[0];
        int index=1;

        for (int i = 1; i < nums.length ; i++)
            if (nums[i]!=min){
                min=nums[i];
                nums[index]=min;
                index++;
            }
        return index;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,2};
        RemoveDuplicateSort obj =new RemoveDuplicateSort();
        System.out.println(obj.removeDuplicates(nums));
    }
}
