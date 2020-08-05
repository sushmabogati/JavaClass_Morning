package day12;

public class Employee {
	String empName;
	int empId;		

	public Employee() {//variable haru initialize garaunu chaina 
		System.out.println("default constructer");
		
	}

	public Employee(String Name) {
		empName= Name;
		
		System.out.println("argumented constructer");
		
	}
	public Employee(int id) {
		empId = id;
		System.out.println("argumented constructer");
		
	}
	public Employee(String name, int id) {
		empName = name;
		empId = id;
	}
	/*
	 * public Employee(String name, int id) { note- same constructor with same
	 * argument in same order can not be made but if the position of the argument is
	 * changed it can be made empName = name; empId = id; }
	 */
	public Employee(int id, String name) {
		empName = name;
		empId = id;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();//note:- if no default constructor is made then compiler itself gives default compiler.
		Employee e2 = new Employee(11, "ram");
	}
	

}