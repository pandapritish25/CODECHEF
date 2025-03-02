// loops
// imaginary playing of a game using loops

import java.util.Scanner;
import java.util.Random;

public class e {
	public static void main(String[] args) throws InterruptedException {
		// imaginary game
		String response = " ";

		Scanner scanner = new Scanner(System.in);

		while(!response.equals("Q")) {
			System.out.println("Press q to exit");
			response = scanner.next().toUpperCase();
		}

		random number game
		int guess = 100;
		int attempts;
		int randomNumber;
		Random random = new Random();

		randomNumber=random.nextInt(1 , 11);

		guess = scanner.nextInt();
		while(guess != randomNumber) {
			System.out.println("Play again");
			guess = scanner.nextInt();
		}


		// for loops


		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("HAPPY NEW YEAR");


		// methods inside java how to use the methods inside java

		happy("pritish");
		happy("Ranjan");
		happy("panda");
		int ans1 = numberz(3);
		System.out.println(ans1);
	}

	// declaring void inside java
	// for void , you have to use static only you cant use any other variable so you have to use static only rather than anything
	// so while writing any of the functions , you have to give the datatype and also the word static inside it

	static void happy(String name) {
		System.out.println("Happy Birthday");
		System.out.println(name);
	}
	static int numberz(int n) {
		int ans = n * n;
		return ans;
	}
	
}
