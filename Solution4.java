class Solution4 {

    public static int hourglassSum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;

        // Loop for rows
        for (int i = 0; i <= 3; i++) {

            // Loop for columns
            for (int j = 0; j <= 3; j++) {

                int sum =
                        arr[i][j]     + arr[i][j + 1]     + arr[i][j + 2]
                                      + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    // Main method
    public static void main(String[] args) {

        int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}
