package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

		String pettype = JOptionPane.showInputDialog(null, "What would you like to buy?");
		
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (true) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do?", "Pet Actions", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Pet", "Walk" }, null);
			
			if (happinessLevel == 10) {
				JOptionPane.showMessageDialog(null, "Your pet loves you");
				break;
			}
//               					 0		 1	    2
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void feed(String pettype) {

		if(pettype.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat meows after eating the cat food");
		}
		
		if(pettype.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Wags its tail");
		}
		
		if(pettype.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Your fish swims around eating food");
		}
		
		happinessLevel += 1;
		
	}
	
	static void pet (String pettype) {
		
		happinessLevel += 1; 
		
		if (pettype.equals("fish")) {
			happinessLevel -= 1;
		}
		
	}
	
	static void walk (String pettype) {
		
		if (pettype.equals("dog")) {
		happinessLevel += 1;
		
		if (pettype.equals("fish")) {
			happinessLevel -= 2;
		}
		
		if (pettype.equals("cat")) {
			happinessLevel -=1;
		}
		
		
		}
		
		
		
	}
	
	
}


































