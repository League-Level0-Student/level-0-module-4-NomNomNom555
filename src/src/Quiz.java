package src;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		
	String word=JOptionPane.showInputDialog("Enter a word.");
	String hashtag=JOptionPane.showInputDialog("Enter number.");	
		
	int one = Integer.parseInt(hashtag);
	
	for (int i = 1; i <= one; i++) {
		System.out.println(word);
	}
	
	
		
	}	
}
