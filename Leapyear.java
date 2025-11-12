
package leapyear;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        
       // Scanner input = new Scanner(System.in);
        //int year = input.nextInt();
        //System.out.println("enter a year");
     // boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0);
        
        //System.out.println( year +" is a leap year?"+ isleapyear);
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        int year = input.nextInt();
        boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(year +" is a leap year ?" + isleapyear);
        
        
    }
    
}
