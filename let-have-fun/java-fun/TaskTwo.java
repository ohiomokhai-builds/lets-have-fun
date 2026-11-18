
import java.util.Scanner;

public class TaskTwo {

        public static void main (String... args) {

        Scanner input = new Scanner (System.in);

        int  counter = 0;
        int sumScore = 0;
	      int averageCounter = 0;

        while (counter <= 9) {

        System.out.println("Enter any score: ");

        int score = input.nextInt();

        sumScore = sumScore + score;

        counter++;
	      averageCounter++;

        }

        int averageScore = sumScore / averageCounter;

	System.out.println("The average score is: "averageScore);

        }

} 

