
package amountofwatter;
import java.util.Scanner;
public class Amountofwatter {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println(" enter amount of water in kilogram, initial temprature and final temprature");
         double water = input.nextDouble();
         double initialT = input.nextDouble();
       double finalT = input.nextDouble();
       double M = input.nextDouble();
       double Q = M  * (finalT - initialT)* 4184;
        System.out.println("+water "+initialT+" +finalT  Q +");
         
    }
    
}
