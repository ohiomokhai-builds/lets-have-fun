
import java.util.Scanner;

public class TaskOne {

	public static void main (String... args) {

	Scanner input = new Scanner (System.in);

	int  counter = 0;
	int sumScore = 0;

	while (counter <= 9) {

	System.out.println("Enter any score: ");

	int score = input.nextInt();

	sumScore = sumScore + score;

	counter++;

	}

	System.out.println("The sum of the score: "sumScore);

	}

} 

