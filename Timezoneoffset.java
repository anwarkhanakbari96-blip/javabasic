
package timezoneoffset;

import java.util.Scanner;

public class Timezoneoffset {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter the  time zone offset to GMT:");
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = (totalHours + offset)%24;
        System.out.println("the current time is"+ currentHours +":" + currentMinutes +":"+ currentSeconds);
                
    }
    
}
