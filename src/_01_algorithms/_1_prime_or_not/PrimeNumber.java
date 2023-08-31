package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("List of prime numbers:");
		System.out.println("2 3 5");

		//int numInt = 2;
		//1999999999

		int count = 0;

		for(int numInt = 2; numInt < 1999999999 ; numInt++) {

			for(int i = 2; i < numInt/2; i++) {

				if (numInt % i == 0) {
					break;
				}

				else if (i == numInt/2 -1) {
					System.out.print(numInt + " ");
					count += 1;

					if (count == 20){

						System.out.println();
						count = 0;
					}




				}






			}
		}

	}

}

