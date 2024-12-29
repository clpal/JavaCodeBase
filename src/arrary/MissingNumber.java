package arrary;
public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number is the difference between expected and actual sums
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = 6; // Total numbers from 1 to n
        System.out.println("Missing Number is: " + findMissingNumber(arr, n));
    }
}
// https://chatgpt.com/c/6762afa2-0d2c-8008-9d0e-70061934e802