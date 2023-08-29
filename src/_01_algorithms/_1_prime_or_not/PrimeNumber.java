package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {

		String numString = JOptionPane.showInputDialog("Enter a number to see if it is prime.");

		int numInt = Integer.parseInt(numString);

		for(int i = 2; i < numInt; i++) {
			
			if (numInt % i == 0) {
				
				JOptionPane.showMessageDialog(null, "Not prime!");
				
				System.exit(0);
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Prime nunmber!");
				
				System.exit(0);
				
			}
		}
	}

}
