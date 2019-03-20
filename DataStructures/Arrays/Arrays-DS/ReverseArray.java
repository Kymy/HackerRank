import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int [] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i]= a[a.length - i - 1];
        }
        return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] arrItems = scanner.nextLine().split(" ");
        int[] arr = new int[arrItems.length];

        for (int i = 0; i < arrItems.length; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
           System.out.print(res[i] + " ");
        }
        System.out.println("\n");
        scanner.close();
    }
}
