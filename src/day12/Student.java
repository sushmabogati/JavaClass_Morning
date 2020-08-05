package day12;

public class Student {
	// never initialize data in non static variable. leave it with default value.
	// For eg string has null default value and int has 0.
	String name;
	int roll;

	public static void main(String[] args) {
		Student student = new Student();
		student.assignInfo("sushma", 1);
		student.printInfo();
//		System.out.println(student.name);= not good practice to print out this way. Print it using method
//		System.out.println(student.roll);
		System.out.println("==========");
		Student student1 = new Student();
		student1.assignInfo("maya", 1);
		student1.printInfo();

		student1.assignInfo("saya", 1);// here same obj student1 has been assigned twice. Object can be assigned with//
										// diff data using method.
		// If data has to be run once
		// and stored as soon as an obj is constructed then constructer has to be made
		student1.printInfo();

		/*
		 * System.out.println(student1.name);
		 */System.out.println(student1.roll);
		/*
		 * student.name="sushma";//in java data should not be set directly. Set data
		 * using a method student.roll=1; System.out.println(student.name);
		 * System.out.println(student.roll); Student student2 = new Student();
		 * student2.name = "Maya"; student2.roll= 1; System.out.println(student2.name);
		 * System.out.println(student2.roll);
		 */

	}

	public void assignInfo(String n, int r) {// here if you want to use argument name same as variable name then you
												// have to use keyword this. The best way is to use same name and the keyword this.
		name = n;
		roll = r;

	}

	public void printInfo() {
		System.out.println("student name is " + name);
		System.out.println("student id is " + roll);

	}

}
