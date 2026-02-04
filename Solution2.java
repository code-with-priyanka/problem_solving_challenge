import java.util.HashMap;

class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number and index
            map.put(nums[i], i);
        }

        return new int[] {}; // (This will never happen as per problem)
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution2 obj = new Solution2();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
