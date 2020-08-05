package day6;

public class OperatorsDemo3 {
/*Increment and decrement operator
 * ++ --
 * a++ a-- post //first operation is done then the increment is done
 * ++a --a pre*/ //increment is done first and the operation is done.
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		int x = 4;
		System.out.println(x);//
		System.out.println(x++);//
		System.out.println(x);//
		
		int m = 5;
		int n = m++;//here following right to left associativity the value of m is assigned to n. so n is 5
		//then value of m is increased by 1.
		System.out.println(m);//
		System.out.println(n);
		
		
	}

}
