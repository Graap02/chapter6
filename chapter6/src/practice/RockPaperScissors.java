package practice;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		int user;
		int computer;
		String msg = null;
		int count = 0;
		final int LOW = 1;
		final int HIGH = 3;
		int choice;
		{
		computer = LOW + (int)(Math.random() * HIGH);
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Type one of the following numbers:"
				+ "\n1 -- Rock" + "\n2 - Paper\n3 -- Scissors"));
		if(computer == 1) {
			if(user == 1) {
				msg = "Tie";
			}
			else if(user == 2) {
				msg = "You lose";
			}
			else
				msg = "You win";
				count = count + 1;
		}
		if(computer == 2) {
			if(user == 2) {
				msg = "Tie";
			}
			else if(user == 3) {
				msg = "You win";
				count = count + 1;
			}
			else
				msg = "You lose";
		}
		if(computer == 3) {
			if(user == 3) {
				msg = "Tie";
			}
			else if(user == 1) {
				msg = "You lose";
			}
			else
				msg = "You win";
				count = count + 1;
		}
		JOptionPane.showMessageDialog(null, "\n Did you win?\n: " + msg + "\nNumber of wins " + count );
		choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to play again? 999"
				+ " to quit."));
	}while(choice != 999);
		
		}
	
}
