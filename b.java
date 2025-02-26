// arithmetic operators

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;

		// taking 2 number inside one input and printing all the operations
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();

		int add1 = number1 + number2;
		int sub1 = number1 - number2;
		int prod1 = number1 * number2;
		int div1 = number1 / number2;
		int mod1 = number1 % number2;

		System.out.println(add1);
		System.out.println(sub1);
		System.out.println(prod1);
		System.out.println(div1);
		System.out.println(mod1);

		// increament and decreament operators. So we have the increament and decreament operators
		// alike we need x = x + 1 then we can have that inside x ++ or ++ x. x ++ will show the output inside next line
		// ++ x will show the outut inside the same line
		add1 ++;
		sub1 --;

		System.out.println("The value of add1 is " + add1);
		System.out.println("The value of sub1 is " + sub1);

		// different between add++ and ++add so major difference is that they are preincreament and also post increament operators
		//  inside add++ the value is assigned and then increamented but inside ++add the value is increamented and then assigned

		int add = 10;
		int before = add++;
		int after = ++add;

		System.out.println(add);
		System.out.println(before);
		System.out.println(after);


		// if statements inside java
		System.out.println("Enter your age");
		int age = scanner.nextInt();

		if(age >= 18) {
			System.out.println("You are an adult");
		}
		else if(age < 0) {
			System.out.println("You are not born yet");
		} 
		else {
			System.out.println("You are a child");
		}

		// isempty inside java
		System.out.println("Enter your name");
		String name1 = scanner.nextLine();
		if(name1.isEmpty()) {
			System.out.println("You didnot enter your name");
		}
		else {
			System.out.println("Your name is " + name1);
		}
	}
}