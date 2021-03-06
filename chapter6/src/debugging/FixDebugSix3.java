package debugging;

//FixDebugSix3.java
//Prompt user for value to start
//Value must be between 1 and 20 inclusive
//At command line, count down to blastoff
//With a brief pause between each displayed value
import javax.swing.*;
public class FixDebugSix3
{
	public static void main(String[] args)
	{
	 String userNumString;
	 int userNum;
	 int value = 0;
	 final int MIN = 1;
	 final int MAX = 20;
	 
		 userNumString = JOptionPane.showInputDialog(null,
		     "Enter a number between " + MIN + " and " + MAX + " inclusive");
		 userNum = Integer.parseInt(userNumString);
		 while(userNum < MIN || userNum > MAX)
		 {
		    //userNumString = JOptionPane.showInputDialog(null,
		    System.out.println("Number out of range" +
		     "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
		    userNum = Integer.parseInt(userNumString);
		 }
		 for(int x = userNum; x >= 0; x = x - value) {
			 {
			   System.out.print(value + "  ");
			   value = value + x;
			    // Adjust these numbers for faster or slower performance
			 }
		 System.out.println("Blastoff!");
		 }
	}
}
