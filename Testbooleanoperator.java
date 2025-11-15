
package testbooleanoperator;

import java.util.Scanner;


public class Testbooleanoperator {

    public static void main(String[] args) {
        
       // Scanner input = new Scanner(System.in);
       // System.out.println("enter an entger: ");
       // int number = input.nextInt();
        
       // if(number % 2 == 0 && number % 3 ==0)
          //  System.out.println(number +"is divisible by 2 and 3.");
       // if(number % 2 == 0 || number % 3 ==0)
          //  System.out.println(number +" is divisible by 2 or 3.");
       
       // if(number % 2 == 0 ^ number % 3 == 0)
           // System.out.println(number +" is divisible by 2 or 3, but not both");
           
           Scanner input = new  Scanner(System.in);
           
           System.out.println("enter an intger number:"); 
           int number = input.nextInt();
           if(number % 2 ==0 && number % 3 == 0)
               System.out.println(number +" is divisble by 2 and 3");
           if(number % 2 == 0 || number % 3 ==0)
               System.out.println(number + " is divisible by 2 or 3");
           if(number % 2 == 0 ^ number % 3 == 0 )
               System.out.println(number +" is divisile by 2 or 3, but not both");
    }
    
}
