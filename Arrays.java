
package arrays;

import java.util.Scanner;







public class Arrays {

    public static void main(String[] args) {
     Scanner myscanner =new Scanner (System.in);
     int score[] = new int[4];
  
     score[0] = myscanner.nextInt();
    score[1] = myscanner.nextInt();
    score[2] = myscanner.nextInt();
  score[3] = myscanner.nextInt();
  int total = 0;
  for(int s : score)
      total = total + s;
        System.out.println("total score :"+ total);
    
    }
}
