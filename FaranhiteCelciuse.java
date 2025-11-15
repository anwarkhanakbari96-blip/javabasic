
package subtotalgratuityrate;


import java.util.Scanner;



public class FaranhiteCelciuse {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("enter a gratuityrate and subtotal");
            
            double gratuityrate = input.nextDouble();
            double subtotal = input.nextDouble();
           
            double gratuity = subtotal * gratuityrate / 100;
            double total = subtotal * gratuity;
            System.out.println("the gratuity is $" + gratuity +" and total is $" + total );
                    
            


        }


}