class Solution6 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 0; // pointer for unique elements

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // number of unique elements
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution6 obj = new Solution6();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
