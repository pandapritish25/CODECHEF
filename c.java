// printing of the random numbers;
// using the math functions.
import java.util.Random;
import java.util.Scanner;
// class math is not inside java.utils
 public class c {
 	public static void main(String[] args) {
 		take the random as the way you took scanner but make sure not to include System.in as no input is there
 		Random random = new Random();
 		int number;
 		// take that number inside nextInt and then print that number;
 		number = random.nextInt();
 		System.out.println(number);
 		// if you want to print random number between a specific range then
 		// if you want to print random number within a specific range then you have to perform all these operations
 		// and yes the ranges are exclusive , these ranges are never included while printing the results.
 		int rand_number;
 		rand_number = random.nextInt(1 , 10);
 		System.out.println(rand_number);

 		// game for flipping a coin

 		int flip;
 		// as the range is exclusive for that reason we need to use 0,2 else we can use nextBoolean
 		flip = random.nextInt(0 , 2);
 		if(flip == 1) {
 			System.out.println("HEADS");
 		}
 		else {
 			System.out.println("TAILS");
 		}

 		// other way for the development of the game;
 		boolean flip1;
 		flip1 = random.nextBoolean();

 		if(flip1 == true) {
 			System.out.println("HEADS");
 		}
 		else {
 			System.out.println("TAILS");
 		}

 		// importing the math class so you have a math class which you can use for the value of PI and E

 		System.out.println(Math.PI);
 		System.out.println(Math.E);



 		// so here inside we need to have pow for that we need to use Math.pow. 
 		//PS: Always make sure that the pow should be inside double , pow should be inside double
 		Scanner scanner = new Scanner(System.in);


 		// performing some math operations 

 		System.out.println("Enter the first number");
 		double number1 = scanner.nextDouble();
 		System.out.println("Enter the second number");
 		double number2 = scanner.nextDouble();

 		// so these are all the math functions that can be used 
 		// math.ceil , math.pow , math.max and also other things so these are some math that can be used

 		double ans2 = Math.max(number1 , number2);
 		double ans3 = Math.min(number1 , number2);
 		double ans4 = Math.ceil(number1);
 		double ans5 = Math.floor(number2);
 		double ans6 = Math.round(number1);
 		double ans7 = Math.sqrt(number2);

 		// printing all the math functions.
 		System.out.println(ans2);
 		System.out.println(ans3);
 		System.out.println(ans4);
 		System.out.println(ans5);
 		System.out.println(ans6);
 		System.out.println(ans7);

 		// printing the hypotenuous using math functions

 		// remember Math.PI can be used as a direct variable so no need to assign it 
 		// like inside circumference 2 * Math.PI * radius

 		System.out.println("Enter the length");
 		double length = scanner.nextDouble();
 		System.out.println("Enter the breadth");
 		double breadth = scanner.nextDouble();

 		double ans1 = Math.pow(length , 2);
 		double ans2 = Math.pow(breadth , 2);

 		double ans3 = ans1 + ans2;
 		double ans4 = Math.sqrt(ans3);

 		System.out.println("Hypoteneous is" +  ans4);

 		// usage of the printf statement
 		// so basically the printf statement is used to format the statement

 		double j = 3.997;
 		System.out.printf("%.1f%n" , j);

 	}
 }