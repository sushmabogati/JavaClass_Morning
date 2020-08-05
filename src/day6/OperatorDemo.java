package day6;

public class OperatorDemo {

	public static void main(String[] args) {
		// Arithmetic Operator
		//+(plus) -(minus) *(multiply) %(modulus) /(divide)
		/*precedence(priority) + and - had low precedence whereas /, * % has high precedence*/
		//% i.e modulus in computer gives remainder and / gives quotient.
		//Associativity:left to right
		int a =45+5-4/2-7%2-2*3;//statement made using two or more operator is called expression.
		/*in first iteration, following the left to right associativity and precedence 4 is divided by 2
		int a = 45+5-2-7%2-2*3;
		In 2nd Iteration
		= 45+5-2-1-2*3
		in third iteration
		= 45+5-2-1-6
		in fourth iteration
		=50-2-1-6
		in fifth iteration
		=48-1-6
		in 6th iteration
		=47-6
		in 7th iteration
		=41*/
		System.out.println(a);
		
	
		
		
	}

}
