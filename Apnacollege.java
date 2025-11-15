
import java.util.Scanner;
  
    
public class Apnacollege  {


public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter a subtotal and gratuityrate");
    double subtotal = input.nextDouble();
    double gratuityrate = input.nextDouble();
    double gratuity = subtotal * gratuityrate / 100;
    double total = subtotal * gratuity;
    System.out.println("the gratuity is $" + gratuity +" and total is $" + total +"");
    
 
    
    
     
   
}

}