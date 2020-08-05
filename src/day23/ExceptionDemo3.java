package day23;

import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a:");
		int a = input.nextInt();
		System.out.println("enter b:");
		int b = input.nextInt();
		try {
			System.out.println("Try start");
			int div = divide(a, b);
			System.out.println("dividion is" + div);
			System.out.println("Try end");

		} catch (ArithmeticException e) {
			System.out.println("Inside catch");
		}finally {
			//note- finally block always runs. resource release garne, close garne shut down garne code. Classes that extends closeable or AutoCloseable class is called resouce class. Scanner is an example of resource class.
			System.out.println("inside finally block");
			input.close();
		}
		
		/*String s = " ";
		s.charAt(5);//Gives StringIndexOutOfBoundsException*/
		
		int [] arr = {2, 3};
		System.out.println(arr[3]);//Gives ArrayIndexOutOfBoundsException

		System.out.println("more code");
		System.out.println("more and more code");
	

	}

	public static int divide(int a, int b) {
		return a / b;
	}


}
