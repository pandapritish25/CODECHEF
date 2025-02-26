// Basic introduction of java


// input inside java program.
// So to have an input , we would be needing the use the Scanner class;
import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		/*so basically this is used to print lines and statements
		for printing the lines and the statements , we would be needing system.out.print() and to print that 
		inside a new line we would be needing system.out.println() and \n will help to go inside newline */
		System.out.print("Hello\n");
		System.out.println("Hello world");
		System.out.println("I like pizza");

		// declaration of datatypes and also variables
		String name = "Pritish";
		int age = 20;
		// make sure after float an f should be mentioned . After float , f should be mentioned there
		float f = 1.9f;
		// double has more precision than float
		double x = 9.747;
		boolean g = true;
		char c = '$';

		System.out.println(name);
		System.out.println(age);
		/* you can also print anything inside system.out.println , you dont have to see any datatype or anything else
		 here char , anything can be printed inside this */
		System.out.println(f);
		System.out.println(x);
		System.out.println(g);
		System.out.println(c);


		// if else statements and these are few of the primitive datatypes
		boolean is_student = true;

		if(is_student == true) {
			System.out.println("He is a student");
		}
		else {
			System.out.println("He is not a student");
		}

		// concatanation of the strings addition of 2 strings
		String name1 = "Pritish";
		String surname1 = "Panda";
		// so basically you can make another string and store this inside that string as well
		String ans = name1 + surname1;
		System.out.println(name1 + surname1);

		// inputting variables inside scanner;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your fav food");
		String favfood = scanner.nextLine();
		System.out.println("Your fav food is " + favfood);

		/* Difference between system.nextLine and system.next is that inside system.next , this wouldnot read any
		 next line , this will only read the first word but inside nextLine this will read entire line. one of the examples
		 is there enter vada paw */

		 System.out.println("Enter your fav food 2");
		 String favfood2 = scanner.next();
		 System.out.println("Enter your fav food 3");
		 String favfood3 = scanner.nextLine();
		 System.out.println(favfood2);
		 System.out.println(favfood3);

		 // to read an integer , there is an different method which is nextInt();
		 
		 System.out.println("Enter your age");
		 int age1 = scanner.nextInt();
		 System.out.println("Your age is");
		 System.out.println(age1);


		 // for double , you need to have next double
		 System.out.println("Enter your gpa");
		 double gpa = scanner.nextDouble();
		 System.out.println("Your GPA is " + gpa);
		 System.out.println("Enter if he is a student");

		 boolean student = scanner.nextBoolean();
		 if(student == true) {
		 	System.out.println("He is a student");
		 } 
		 else {
		 	System.out.println("He is not a student");
		 }

		 // calculate the length of the rectangle

		 double width = 0;
		 double length = 0;

		 // inputting the variables here

		 System.out.println("Enter the width");
		 width = scanner.nextDouble();
		 System.out.println("Enter the length");
		 length = scanner.nextDouble();

		 // calculation of area and printing here

		 double area = 0;
		 area = width * length;
		 System.out.println("Area is " + area);

		 // madlibs game only one line

		 Scanner scanner = new Scanner(System.in);
		 String adjective;
		 System.out.println("Enter the adjective");
		 adjective = scanner.nextLine();
		 System.out.println("The adjective is" + adjective);
	}
}