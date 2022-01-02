import java.util.Arrays;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

        public static void main (String[]args){
            int[] values = {0,2,2,0};
            System.out.println(containsDuplicate(values));

            int [] values2 = {1,2,3,4};
            System.out.println(containsDuplicate(values2));

            int [] values3 = {1,2,1,3};
            System.out.println(containsDuplicate(values3));
    }
}
