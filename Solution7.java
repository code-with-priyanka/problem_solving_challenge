import java.util.Arrays;

class Solution7 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // number of unique elements
    }

    // Main Method
    public static void main(String[] args) {

        Solution7 obj = new Solution7();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of Unique Elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
