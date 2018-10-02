package GameZone;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quizAnswer;
		String result;
		
		System.out.println("The following is a short quiz, please take some time to answer these questions.");
		System.out.print("A structure that allows repeated execution of a block of a statements is a ? "
				+ "\n1 - Cycle"
				+ "\n2 - Loop"
				+ "\n3 - Ring"
				+ "\n4 - band");
		quizAnswer = input.nextInt();
		
		if(quizAnswer == 2) 
		{
			System.out.println("Correct! Onto the next question.");
		}
		else if(quizAnswer == 1) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 3) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 4) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}

		System.out.println("A loop that never end is a ? loop."
				+ "\n1 - Iterative"
				+ "\n2 - Infinite"
				+ "\n3 - Structured"
				+ "\n4 - Illegal");
		quizAnswer = input.nextInt();
		
		if(quizAnswer == 2) 
		{
			System.out.println("Correct! Onto the next question.");
		}
		else if(quizAnswer == 1) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 3) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 4) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
			
		System.out.println("To construct a loop that works crrrectly, you should initialize a loop to control ? "
				+ "\n1 - Variable"
				+ "\n2 - Constant"
				+ "\n3 - Structure"
				+ "\n4 - Condition");
		quizAnswer = input.nextInt();
		
		if(quizAnswer == 1) 
		{
			System.out.println("Correct! Onto the next question.");
		}
		else if(quizAnswer == 2) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 3) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}
		else if(quizAnswer == 4) 
		{
			System.out.println("Incorrect! Onto the next question.");
		}	
	}
public static void displayMessage(String result) {
	System.out.println("You got ")
}
}
