

import java.util.Scanner;

public class TaskSeven {

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

        int averageEven = sumScore / counter;

	System.out.println("The sum of the EvenNumbers is: " + sumScore);
        System.out.println("The average of the EvenNumbers is: " + averageEven);

        }

} 


