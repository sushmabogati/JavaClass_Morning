package day16;

import java.util.Scanner;

public class MethodDemo2 {
//here, In below, We have main method from MethodDemo2

//we can take anything as argument that can be class, library class or an array and return anything. 
		


	public static void printArrayElement(int[]arr) {
		for(int a:arr) {
			System.out.println(a);
		}
		
	}
	public static int[] retrunArray(Scanner input) {

		System.out.println("enter the size of the array");
		int size = input.nextInt();
;		int[] arr = new int[size];
    System.out.println("Enter data in the array");
    for(int i =0; i<arr.length;i++) {
    	arr[i]= input.nextInt();
    }
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr = retrunArray(new Scanner(System.in));//to  take on input
		printArrayElement(arr);
	}

}
