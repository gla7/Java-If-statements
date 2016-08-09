
public class Application {// we will now see if statements in Java!

	public static void main(String[] args) {// if statements have a very similar format in Java than that of JS!
		for (int i = 0; i <= 10; i++) {// combining for loops with if statements to see how both interact in Java!
			if (i < 5) {
				System.out.println("i is less than 5, as it is now " + i);
			}
			else if (i >= 5 && i < 8) {// same && conditional structure than JS!
				System.out.println("i is less than 8, but greater or equal to 5, as it is now " + i);
			}
			else {
				System.out.println("i is greater or equal to 8, as it is now " + i);
			}
		}
		int counter = 1;
		while (true) {
			System.out.println("While looping as long as counter is not 5!");
			if (counter == 5) {
				break;//same as break loop in JS!
			}
			counter++;
		}
	}

}
