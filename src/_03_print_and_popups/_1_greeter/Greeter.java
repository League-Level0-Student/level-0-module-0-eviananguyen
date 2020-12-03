package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("what is your fav food");
		
		
		JOptionPane.showMessageDialog(null, input + " thats discusting");
		
		JOptionPane.showMessageDialog(null, "John 3:16");
		
		JOptionPane.showMessageDialog(null, "for god so love the world,as to give his ony begotten Son ");
		String name =JOptionPane.showInputDialog("what is your name");
				JOptionPane.showMessageDialog(null,  "hello  "+ name + " its nice to meet you");
	}
}
