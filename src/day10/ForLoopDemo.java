package day10;

import java.util.Scanner;

public class ForLoopDemo {// in for loop we know how many times the loop is going to run. In while loop,
							// loop repeats till the condition is true.
	int a;// instance variable. If an instance variable i not initialized then it gets
			// default value. Here in this case it gets 0
			// Instance variable have two types. One with static and another with
			// non-static.

	public static void main(String[] args) {

		/*
		 * for(initialization; condition; update increment/decrement ) {
		 * 
		 * }
		 */
		ForLoopDemo ob = new ForLoopDemo();
		System.out.println(ob.a);// Instance variable gets default value of int if it's not initialized.

		Scanner input = new Scanner(System.in);
		System.out.println("enter n");
		int n = input.nextInt();
		int sum = 0;// local variable must be initialized. If it's not then it throws errors.
		for (int i = 1; i <= n; i++) {
			sum = sum + 1;
			System.out.println("the sum is " + sum);
		}

	}

}
