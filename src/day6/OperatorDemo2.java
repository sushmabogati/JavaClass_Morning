package day6;

public class OperatorDemo2 {
	public static void main(String[] args) {
		/*Assignment Operators
		 *  = 
		 *  +=, -=, *=, /=,  %=  these are compound assignment operator of short hand operator*/
		//In associativity associativity id right to left
		int a =4+5-4/2-7%2-2*3;//the final calculated value is stored inside the memory in binary digits
		System.out.println(a);
		int x =5;
		System.out.println(x);
		x+=2;//x = x+2;
		System.out.println(x);
		
	}

}
