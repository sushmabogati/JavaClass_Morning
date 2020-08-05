package day2;
//find sum and average of two numbers input by User (using Scanner class).
public class Calculator1 {
	public static void main(String[] args) {
		//In java if you don't want to get anything from anywhere you can just sysout(sysout and control space) and add numbers in the small bracket.
		System.out.println(4 + 5);//But in actual programming variable has to be declared.
		
		
		int a = 5 ;
		//In above int is data type, a is variable, = is operator and 5 is literal meaning it's a fixed value.
		//data type of variable should always be declare. What kinda of data type is a variable taking must be declared.
		int b = 4;
		System.out.println(a +b);// this can be done too but in actual programming another variable is declared. 
		//Let's say variable named sum with data type int is declared
		int sum = a +b;
		System.out.println(sum);
		System.out.println("the sum of a and b is"+" "+sum);
		System.out.println("The addition "+ a+ " and "+b+" is "+" "+sum);//in order to display the value of a and b
		//do not include variables inside double quotation sign. To print the value of a variable concade variable name with + sign.
		int sub = a - b;
		System.out.println("The substraction of "+a+ " and "+b+" is: "+ sub);
		int mul = a*b;
		System.out.println("The multiplication of "+a+" and "+b+" is "+mul);
		int div = a/b;
		System.out.println("The division of "+a+" and "+b +" is "+ div);
		//Note:- The above program will only do calculations for fixed declared values(literals)
		//lets make a program where user can put different values. Lets got to Calculator 2
		
		
		
		
	}

}
