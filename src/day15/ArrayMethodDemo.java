package day15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] ar =returnArray(input);
		System.out.println(Arrays.toString(ar));
		printArray(ar);
	}

	

	private static String[]  returnArray(Scanner input) {
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		String[] arr = new String[size];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("enter elements");
			arr[i]=input.next();
		}
		return arr;
		// TODO Auto-generated method stub
		
	}
	public static void printArray(String[] ar) {
		for(int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
			
		}
		
	}
	

}
