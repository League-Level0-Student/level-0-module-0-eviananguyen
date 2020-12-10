package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer = JOptionPane.showInputDialog(null, "what planet are we on?");
				// 2.  Ask the user a question 
				if(answer.equalsIgnoreCase("EaRtH")) { 
					score = score +1;
					
					JOptionPane.showMessageDialog(null, "you are correct!");
				
				}
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
				else { 
					JOptionPane.showMessageDialog(null, "incorect! the answer is EaRtH");
				}
				answer = JOptionPane.showInputDialog(null, "what planet is closeest to earth?");
				if(answer.equalsIgnoreCase("mars"))   {
					score = score +1;
					
					JOptionPane.showMessageDialog(null, "you are correct");
					
					
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	JOptionPane.showMessageDialog(null, "you answered " + score + " question(s) correctly.");
	}
}
