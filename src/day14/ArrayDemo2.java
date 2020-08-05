package day14;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		//to take input
		int [] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("enter element");
			arr[i]=input.nextInt();
		}
		//to print and sum elements of an array
		int sum =0;
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("the sum is "+sum);

	}

}
