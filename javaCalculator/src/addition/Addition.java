package addition;

import javax.swing.JOptionPane;


public class Addition {
	
	
	String num1 = JOptionPane.showInputDialog("Enter the first digit:");
	

	int num_1 = Integer.parseInt(num1);
	
	String num2 = JOptionPane.showInputDialog("Enter the second digit:");
	int num_2 = Integer.parseInt(num2);
	
	
	int total = num_1 + num_2;


}



