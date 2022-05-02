import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {
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

    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int nums[]={3,1,2,4};
        System.out.println(Arrays.toString(obj.sortArrayByParity(nums)));
    }
}
