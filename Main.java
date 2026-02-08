import java.util.*;

public class Main {
    public static void plusMinus(int[] arr) {
        int n = arr.length;

        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Count positives, negatives, and zeros
        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Calculate ratios
        double posRatio = (double) positive / n;
        double negRatio = (double) negative / n;
        double zeroRatio = (double) zero / n;

        // Print with 6 decimal places
        System.out.printf("%.6f%n", posRatio);
        System.out.printf("%.6f%n", negRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        plusMinus(arr);
    }
}
