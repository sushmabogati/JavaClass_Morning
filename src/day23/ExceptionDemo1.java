package day23;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("enter a:"); int a = input.nextInt();
		 * System.out.println("input b:"); int b = input.nextInt(); int div = a/b;
		 * System.out.println("division is "+div); //If you put any num for a and 0 for
		 * b it ll give arithmetic exception.
		 */

		//ExceptionDemo1 ob = null;  this gives null point exception. 
		ExceptionDemo1 ob = new ExceptionDemo1();
		int div = ob.divide(input);
		System.out.println("division is " + div);
		input.close();
	}

	public int divide(Scanner input) {
		System.out.println("enter a:");
		int a = input.nextInt();
		System.out.println("input b:");
		int b = input.nextInt();
		int div = a / b;

		return div;

	}

}
