import java.io.*;
import java.util.*;

/**
 * Problem: https://www.hackerrank.com/challenges/2d-array/problem
 * Thoughts:
 *  We need to get the maximun sum 16 hourglasses, for this we need to
 *  sum the 16 hourglases, for this we need to specify how to 
 *  sum 1 hourglas, for this we need to 
 *  specify the values to sum, given corresponding indexes in array
 * 
 * Space complexity: O(nxn) where n is 16, we need 16 contiguous spaces (the 2D array) + 3 int to store the sums
 * Time complexity:  O((n/4) * [(n/4)(2*2)]) = O((n/4) * (n))   
 * 
 */
public class Solution {

    static int sumRow(int row, int col, int[][] arr) { // 2 operations
        return arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
    }

    static int sumHourGlass(int row, int col, int[][] arr) { // 2 operations
        return sumRow(row, col, arr) + arr[row + 1][col + 1] + sumRow(row + 2, col, arr);
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) { // O(n/4)
            for (int j = 0; j < 4; j++) { // O(n/4)
                int sum = sumHourGlass(i, j, arr); // O(2x2) 
                maxSum = sum > maxSum ?  sum : maxSum;
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("testcases/output/output.txt"));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
