
import java.util.Scanner;

public class TaskFour {

        public static void main (String... args) {

        Scanner input = new Scanner (System.in);

        int  counter = 0;
        int sumScore = 0;
       	//int averageCounter = 0;

        while (counter <= 9) {

        System.out.println("Enter any score: ");

        int score = input.nextInt();

	if (score % 2 == 0) {

        sumScore = sumScore + score;

        counter++;

	}

        	}

        System.out.print(sumScore);

        }

} 

