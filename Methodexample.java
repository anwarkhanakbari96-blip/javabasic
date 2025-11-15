
package methodexample;

import java.util.Scanner;
public class Methodexample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number between 0 and 1000");
        int number = input.nextInt();
        int sum = 0;
        while(number>10){
            sum += number % 10;
        number /= 10;
        System.out.println("the sum of digit is"+sum);
                    
        }
                
        
     
    }
    
}
