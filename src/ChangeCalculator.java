//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick= JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int five=Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dim=JOptionPane.showInputDialog("How many dimes do you have?");
int ten=Integer.parseInt(dim);
		// Ask the user how many quarters they have, and convert their answer
String quart=JOptionPane.showInputDialog("How many quarters do you have?");
int twentyfive=Integer.parseInt(quart);
		// Calculate how much money the user has and save it in a double variable 
double nickels= five*.05;
double dimes= ten*.1;
double quarters=twentyfive*.25;
		// Tell the user how much money they have
	double all= nickels+dimes+quarters;
	JOptionPane.showMessageDialog(null, "You have "+all+" in coins.");
	}
}

