
package numberofyears;


import java.util.Scanner;

public class Numberofyears {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("change the years into minutes");
        
        double minutes = input.nextDouble();
   double  x =365;
        double years = minutes * x ;
      
        System.out.println("the years is"+years);
                
     
    }
    
}
