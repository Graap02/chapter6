package excercises;

import java.util.Scanner;

public class TestScoreStatistics 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int highScore = 0;
		int lowScore = 100;
		int average;
		int count = 0;
		int userChoice;
		int total = 0;
		int userExit = 0;
		
			
		do {	
			System.out.print("Enter a number for your tests");
			userChoice = input.nextInt();
			
			if(userChoice >= highScore) 
			{
				highScore = userChoice;
			}
			else if(userChoice <= lowScore) 
			{
				lowScore = userChoice;
			}
			
			
			System.out.println("Enter the number 999 to exit, or enter another number to continue >> ");
			userExit = input.nextInt();
		}while(userExit != 999);
	}
}