import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        boolean adding = true;

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }

        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
