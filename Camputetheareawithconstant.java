package camputetheareawithconstant;
import java.util.Scanner;

public class Camputetheareawithconstant {

        public static void main(String[] args) {
           
           Scanner input = new Scanner(System.in);
           
            System.out.println("enter a number for faranhite");
            double faranhite = input.nextDouble();
            double celcius = (5.0/9) * (faranhite - 32);
            
            System.out.println("faranhite"  + faranhite + "is" + celcius + "celcius is");
            
            
                                    }
    
}
