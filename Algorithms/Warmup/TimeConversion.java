import java.io.*;
import java.util.*;

/**
 * O(4) space 
 * O(2) time
 * Complexity time and space: constant 
 */
public class TimeConversion {

    static String timeConversion(String s) {

        int hours = Integer.parseInt(s.substring(0, 2));
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        String meridiam = s.substring(8, 10);
        System.out.println(hours + ":" + minutes + ":" + seconds);

        hours -= meridiam.equals("AM") && hours == 12 ? 12: 0;
        hours += meridiam.equals("PM") && hours != 12 ? 12: 0;

        return String.format("%02d", hours) + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) throws IOException {
        
      Scanner input = new Scanner(System.in);
      String time = input.nextLine();
      String result = timeConversion(time);
      System.out.println(result);
      input.close();
    }
}
