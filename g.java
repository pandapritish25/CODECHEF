// oops concepts
// objects are basically those which can hold data and can perform actions
// basically objects are those which can hold data and then perform actions , we store the data inside objects.
// the actions they can perform are known are methods

public class Car {
	String make = "Ford";
	String model = "Mustang";
	int year = 2025;
	int price = 4;
	boolean isrunning = false;

	void start() {
		isrunning = true;
		System.out.println("Start the car");
	}
	void stop() {
		isrunning = false;
		System.out.println("Stop the car");
	}
}
// constructors
public class Student {
	String name;
	int age;
	double gpa;
	boolean isenrolled;

	Student(String name , int age , double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	void study(){
		System.out.println(this.name + " is studying");
	}
}
public class User {
	String username;
	String email;
	int age;

	User(String username) {
		this.username = username;
		this.email = "Not provided";
		this.age = 0;
	}

	User(String username , String email) {
		this.username = username;
		this.email = email;
		this.age = 0;
	}
}

public class Bike {
	String model;
	String colour;

	Bike(String model , String colour) {
		this.model = model;
		this.colour = colour;
	}
	void drive() {
		System.out.println("You Drive" + " " + this.colour + " " +this.model);
	}
}
public class g {
	public static void main(String[] args) {
		Car car = new Car();
		// . allows to access inside the object.
		System.out.println(car.make);
		System.out.println(car.year);
		System.out.println(car.isrunning);
		car.start();
		car.stop();

		Student student1 = new Student("p" , 9 , 9.2);
		Student student2 = new Student("pq" , 9 , 9.3);


		System.out.println(student1.name);
		System.out.println(student2.name);
		System.out.println(student1.gpa);
		System.out.println(student2.gpa);
		student1.study();


		User user1 = new User("pritish");
		User user2 = new User("patrick" , "pritishdps25@gmail.com");

		System.out.println(user1.username);
		System.out.println(user2.username);
		System.out.println(user2.email);


		Bike bike1 = new Bike("harley" , "black");
		Bike bike2 = new Bike("unicorn" , "blue");

		
		Bike bike[] = {bike1 , bike2};

		for(int i = 0; i < 2; i++) {
			bike[i].drive();
		}
	}
}