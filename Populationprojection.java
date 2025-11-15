
package populationprojection;

import java.util.Scanner;

public class Populationprojection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        int population = 312032486;
        int secondsperyears = 365 * 24 * 60 * 60;
        System.out.println("enter the number of years:");
        int years = input.nextInt();
        int birth = secondsperyears/7;
        int death = secondsperyears/13;
        int immigrant = secondsperyears/45;
        population += (birth - death + immigrant)* years;
        System.out.println(" the population in " + years + " years is " + population );
       
    }
    
}
