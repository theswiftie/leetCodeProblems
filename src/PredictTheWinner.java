import java.util.Arrays;
public class PredictTheWinner {
    static int [] scores = new int [] {0, 0};

    public static boolean predictTheWinner(int[] nums) {
        helper(nums, 1);
        return scores[0] >= scores [1];
    }

    public static int[] helper(int[] nums, int turn) {
        if (nums.length == 0) {
            return scores;
        }

        int [] maxInfo = getMax(nums);
        if (nums.length > 1) {
            if (maxInfo[1] == 0) {
                nums = Arrays.copyOfRange(nums, 1, nums.length);
            } else {
                nums = Arrays.copyOfRange(nums, 0, nums.length - 1);
            }
        }
        else {
            nums = new int[]{};
        }
        if (turn == 1) {
            scores[0] += maxInfo[0];
            helper(nums, 2);
        }
        else {
            scores[1] += maxInfo[0];
            helper(nums, 1);
        }
        return null;
    }

    public static int [] getMax (int [] nums) {
        if (nums[0] >= nums[nums.length - 1]) {
            return new int []{nums[0], 0};
        }
        return new int []{nums[nums.length - 1], nums.length - 1};
    }

    public static void main(String[] args) {
        System.out.println(predictTheWinner(new int []{1,5, 233,7}));
    }
}
