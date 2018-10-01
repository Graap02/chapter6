package excercises;

import java.util.Scanner;

public class EvenEntryLoop2 
{
	public static void main(String[] args) 
	{	
		int userChoice;
		Scanner input = new Scanner(System.in);
		 
		
		{
			System.out.print("Pick a number >>> ");
			userChoice = input.nextInt();
			while(userChoice != 999)
		if(userChoice % 2 == 0)	
			{
			System.out.print("Good job");
			}
		else
			System.out.print("ERROR");

		}

	}

}
