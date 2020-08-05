package day23;

import java.util.InputMismatchException;
import java.util.Scanner;
//ExceptionDemo 1-6 is unchecked runtime exception

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []arr = new int[2];
		/*
		 * System.out.println("enter a:"); int a = input.nextInt();
		 * System.out.println("enter b:"); int b = input.nextInt();//in enterting www it
		 * gives InputMismatchException
		 */

		try {
			int a = input.nextInt();
			System.out.println("enter b:");
			int b = input.nextInt();
			int div = divide(a, b);
			System.out.println("dividion is" + div);
			System.out.println(arr[2]);

		} catch (ArithmeticException|InputMismatchException ae) {
		 ae.printStackTrace();
		}

		System.out.println("more code");
		System.out.println("more and more code");
		input.close();

	}

	public static int divide(int a, int b) {
		return a / b;
	}

}
