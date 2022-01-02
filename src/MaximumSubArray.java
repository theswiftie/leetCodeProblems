public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        if (nums.length == 1){
            return current;
        }

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }

        max = Math.max(current, max);
        return max;
    }

    public static void main(String[] args) {
        int [] array = {-1,-2};
        System.out.println(maxSubArray(array));
    }
}
