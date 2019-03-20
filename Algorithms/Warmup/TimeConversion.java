import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        String [] sections = s.split(":");
        String hours = sections[0];
        String minutes = sections[1];
        String lastSection = sections[2];
        String seconds = lastSection.charAt(0) + "" + lastSection.charAt(1);
        String format = lastSection.charAt(2) + "" + lastSection.charAt(3);
        String timeFormated = ""; 
        int hoursNumber = Integer.parseInt(hours);
        if (format.equals("AM")) {
            if (hoursNumber == 12) {
                hours = "00";
            }
            timeFormated = hours + ":" + minutes + ":" + seconds;
        } else {
            if (hoursNumber != 12) {
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
