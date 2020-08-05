package day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
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

		} catch (ArithmeticException ae) {
			System.out.println(ae);
			// ae.printStackTrace();//prints the stack of errors.
		} catch (InputMismatchException ie) {
			System.out.println(ie);
		}catch (Exception e) {//parent Exception is going to handle all kind of exceptions and it should be at the end.
			System.out.println(e);
		}

		System.out.println("more code");
		System.out.println("more and more code");
		input.close();

	}

	public static int divide(int a, int b) {
		return a / b;
	}

}
