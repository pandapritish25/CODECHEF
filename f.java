// overloaded methods
// overloading of methods mean that methods which share the same name but have different parameters
// methods having same name but have different parameters inside are called overloaded methods

import java.util.Scanner;
import java.util.Arrays;

public class f {
	// class variable are declared inside the class and wherever you use that , this will remain the same , its like function only
	// if you declare anything inside the class then that will remain the same
	static int x = 10;
	public static void main(String[] args) {
		double ans = add(1 , 2);
		System.out.println(ans);
		double ans1 = add(1 , 2 , 3);
		System.out.println(ans1);
		int ans3 = d(1 , 2 , 3);
		int ans4 = d(1 , 2 , 3 , 4);
		System.out.println(ans3);
		System.out.println(ans4);

		local variable
		int x = 1;
		if there are various methods , then we can have them inside same name but inside local , we wont be having them
		inside the same name

		Scanner scanner = new Scanner(System.in);

		String[] foods = new String[3];
	 	foods[0] = "almond";
	 	foods[1] = "peanuts";
	 	foods[2] = "nuts";
		for(int i = 0; i < 3; i++) {
			System.out.println(foods[i]);
		}
		int helper[] = new int[5];
		helper[0] = 1;
		helper[1] = 2;
		helper[2] = 3;
		helper[3] = 4;
		helper[4] = 5;

		for(int i = 0; i < 5; i++) {
			System.out.println(helper[i]);
		}
		System.out.println(helper.length);
		System.out.println(foods.length);
		// for sorting the arrays , you have to perform the following functions so basically for sorting the 
		// arrays , you have to do arrays.sort()

		int helper1[] = new int [4];
		for(int i = 0; i < 4; i++) {
			helper1[i] = scanner.nextInt();
		}
		Arrays.sort(helper1);
		for(int i = 0; i < 4; i++) {
			System.out.println(helper1[i]);
		}
	}
	static double add(double a , double b) {
		return a + b;
	}
	static double add(double a , double b , double c) {
		return a + b + c;	
	}
	static int d(int a , int b , int c) {
		return a + b + c;
	}
	static int d(int a , int b , int c , int d) {
		return a + b + c + d;
	}
}