//One way of taking Input from user using library class Scanner.
package day2;

import java.util.Scanner;//this means a class name Scanner is inside package util.

public class Calculator2 {

	public static void main(String[] args) {
	//in order take an input from users use Scanner.Scanner is a library class. So, it has to be imported.
	//	There are ways to import a library class either hover over and right click the red underline, or right click on cross sign or type and iport if u know
	//type few words and do ctrl space in eclipse or do ctrl shift o.	
	Scanner input/*give any name*/ = new Scanner(System.in);//here S for scanner and system is capital.// To take input use Scanner
	System.out.println("Enter Number 1:");//ask user to enter number 1
	int a = input.nextInt();//I here in Int is capital//the number entered by user in saved in variable a with int data type
	System.out.println("Enter Number 2:");
	int b = input.nextInt();
	int sum = a+b;
	int sub = a-b;
	int mul = a*b;
	int div = a/b;
	System.out.println("The addition of "+a+" and " +b+" is "+sum);
	System.out.println("The substraction of "+a+" and " +b+" is "+sub);
	System.out.println("the multiplication of "+a+" and " +b+" is "+mul);
	System.out.println("the div "+a+" and " +b+" is "+div);
   input.close();//Input from line 11 is being closed

	}

}
