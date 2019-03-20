import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


/**
 * O(8) space 
 * O(2x1) time
 * Complexity time and space: constant 
 */
public class TimeConversion1 {

    static String timeConversion(String s) {
        String [] sections = s.split(":");
        String hours = sections[0];
        String minutes = sections[1];
        String lastSection = sections[2];
        String seconds = lastSection.charAt(0) + "" + lastSection.charAt(1);
        String format = lastSection.charAt(2) + "" + lastSection.charAt(3);
        String timeFormated = ""; 
        int hoursNumber = Integer.parseInt(hours); // O(8) space O(8) time
        if (format.equals("AM")) { // 1 time
            if (hoursNumber == 12) { // 1 time
                hours = "00";
            }
            timeFormated = hours + ":" + minutes + ":" + seconds;
        } else {
            if (hoursNumber != 12) { // 1 time
                hoursNumber += 12; 
            }
            timeFormated = hoursNumber + ":" + minutes + ":" + seconds;
        }
        return timeFormated;
    }

    public static void main(String[] args) throws IOException {
        
      Scanner input = new Scanner(System.in);
      String time = input.nextLine();
      String result = timeConversion(time);
      System.out.println(result);
      input.close();
    }
}
