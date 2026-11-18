

import java.util.Scanner;

public class TaskEight {

        public static void main (String... args) {

        Scanner input = new Scanner (System.in);

        int  counter = 0;
        int sumScore = 0;
	int number = 0;
        //int averageCounter = 0;

        while (counter <= 9) {

        System.out.println("Enter any score: ");

        int score = input.nextInt();

	for(number = 0; number<= 100; number++){

	if (score == number) {

        sumScore = sumScore + score;
	break;
	}

        counter++;

        }

                }

       // int averageEven = sumScore / counter;

        System.out.println("The sum of 10 valid score between 0-100 is: " + sumScore);
       // System.out.println("The average of the EvenNumbers is: " + averageEven);

        }

}

