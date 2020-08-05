package day11;

import java.util.Scanner;

public class MethodDemo3 {
	public static int sum() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a:");
		int a = input.nextInt();
		//input.nextLine();
		System.out.println("enter b:");
		int b = input.nextInt();
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum();
		System.out.println(+result);
	}

}
