package day11;

import java.util.Scanner;

public class MethodDemo2 {
public void printInfo(String name, int age) {
	System.out.println("name is: "+name);
	System.out.println("age is: "+age);
	
}
	public static void main(String[] args) {
		MethodDemo2 obj = new MethodDemo2();
		obj.printInfo("Sita", 22);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String n = input.next();
		System.out.println("enter age:");
		int a = input.nextInt();
		obj.printInfo(n, a);
	input.close();

	}

}
