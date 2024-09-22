import java.util.ArrayList;

public class SortArrayList {
    public static void main (String[] args){
        ArrayList<Integer> nums = new ArrayList<>();

        // [1, 2, 3, 4]
        for (int i = 1; i <= 100000; i++){
            nums.add(i);
        }
        System.out.println(SortArrayList(nums));
    }
    private static ArrayList<Integer> SortArrayList (ArrayList<Integer> nums){
        //actual impl to reorder the elements of array
        //return sorted array

        /*
        leave first num as is
        if second num is even, move it to index 0
        if second num is odd, leave it as is
        */
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.add(0, nums.remove(i));
            }
        }

        return nums;
    }
}
