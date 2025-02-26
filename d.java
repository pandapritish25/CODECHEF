// use of printf statement
// if and nested if statements
// ternary operator and switch case
import java.util.Random;
import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		// usage of the printf statements basically the printf statements would be used like the C++ only
		// the way we use %d , %b and %c inside C++ , The same way we have to use here
		int age = 20;
		char c = 'd';
		double height = 30.2;
		String s = "pritish";
		boolean f = true;

		// so here we have to type syste,.out.printf insted of other things
		// so this is the way to use printf
		System.out.printf("%d\n" , age);
		System.out.printf("%c\n" , c);
		System.out.printf("%f\n" , height);
		System.out.printf("%s\n" , s);
		System.out.printf("%b\n" , f);


		// take the precision inside java

		double price1 = 9.656;
		double price2 = 10.88;
		double price3 = 17.998;

		// now we need to use the precision
		// so this is the way in which the precision would be added "%.1f" .

		System.out.printf("%.1f\n" , price1);
		System.out.printf("%.2f\n" , price2);
		System.out.printf("%.1f\n" , price3);

		// now if you want to do the padding of the numbers like if there is one digit then add 0 behind it
		int id1 = 12;
		int id2 = 11;
		int id3 = 769;

		// so basically you used to write .1 for decimal and then .1 but there if you put 04 it means put 0 infront of all the 4s
		// and if you put only 4 then this will have the spaces inside the folders like this will only have the spaces inside there
		// so this is the major thing that needs to be done

		System.out.printf("%04d\n" , id1);
		System.out.printf("%04d\n" , id2);
		System.out.printf("%04d\n" , id3);

		// and if you need to add the space before wards then that would be %4d and if afterwards then %-4d
		// so final is if before then positive and if after the negative

		// once again revising if basically that is if that is positive then space behind and if that if negative then space after

		System.out.printf("%-4d\n" , id1);
		System.out.printf("%-4d\n" , id2);
		System.out.printf("%-4d\n" , id3);

		// if and nested if statements;

		boolean is_student = true;
		boolean issenior = true;

		double price = 9.99;
		// if student then he will get an disount;
		if(is_student == true) {
			if(issenior == true) {
				System.out.println("You are a senior student");
				price = price * 0.9;
				price = price * 0.9;
			}
			else {
				System.out.println("You will get a student discount");
				price = price * 0.9;
			}
		}
		else {
			System.out.println("You are not a student and not a senior");
			int ok = 1;
		}

		System.out.println(price);

		// usage of all the string methods so we need to see how the string method works;
		String name = "Pritish Ranjan Panda";
		int ans = name.length();
		System.out.println("The length of the string is " + ans);

		
		// so basically to print the first and last index of the character which is there , we need to have 
		// indexOf and lastIndexOf for the characters.

		char third_char = name.charAt(2);
		System.out.println(third_char);

		// so to print this inside the first and last index;
		int first_index = name.indexOf('i');
		int last_index = name.lastIndexOf('i');

		System.out.println(first_index);
		System.out.println(last_index);

		// toUpperCase is used to have all the uppercase characters
		// toLowerCase is used to have all the lowercase characters
		// trim is used to remove all the white space
		// replace is used to replace a character inside the word
		// name.contains will check if that letter is there or not 
		String name1 = name.toUpperCase();
		String name2 = name.toLowerCase();
		String name3 = name.trim();
		String name4 = name.replace("a" , "o");

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);


		String y = "pritish";
		if(y.contains("i")) {
			System.out.println("Yes , this contains the letter");
		}
		else {
			System.out.println("No it doesnot contain the letter");
		}

		// substring is basically to extract one of the methods inside the string;
		String email = "pritishdps25@gmail.com";
		String y1 = email.substring(1 , 6);
		System.out.println(y1);
		// if substring (a , b) is mentioned it means that there is a substring from 1 to 6 and if that is 
		// substring(a) then it will omit till the length of a and then it will display the characters.

		// Now you need to print everything after the @gmail
		// so basically if you need to have substring("") then just mention the number and if you need to have only @gmail.com
		// then have that inside .email.indexof('@');

		String x2 = email.substring(email.indexOf('@') + 1);
		System.out.println(x2);

		Scanner scanner = new Scanner(System.in);
		String email1 = scanner.nextLine();

		String username;
		String domain;


		if(email1.contains("@")) {
			username = email1.substring(0 , email1.indexOf('@'));
			domain = email1.substring(email1.indexOf('@') + 1);
			System.out.println(username);
			System.out.println(domain);
		}
		else {
			System.out.println("Not a valid email");
		}

		// ternary operator;
		int score = 60;
		String pass = (score >= 60) ? "PASS" : "FAIL";
		System.out.println(pass);

		int hr = 20;
		String z = (hr <= 10) ? "true" : "false";
		System.out.println(z);

		String day = "sunday";
		// insted of if else , we would be using switch case;

		// for inputting an character , we need to have scanner.next.charAt(0)

		switch(day) {
			case "monday" : System.out.println("Boring day");
			case "sunday" : System.out.println("Interesting day");
			default -> System.out.println("Not a day");
		}

		Scanner scanner = new Scanner(System.in);

		// so to input a character , we need to have the scanner.next().charAt(0);
		// revising to input a character , we need to have scanner.next().charAt(0);
		char c;
		c = scanner.next().charAt(0);
		System.out.print(c);
	}
}