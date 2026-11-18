
import java.util.Scanner;

public class TaskThree {

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
        averageNumber++;

        }

        double averageScore = sumScore / averageCounter;

	System.out.println("The sum is: " + sumScore)

        System.out.println("The average Score is: " + averageScore);

        }

} 

