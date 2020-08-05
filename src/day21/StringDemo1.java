package day21;

public class StringDemo1 {
	public static void main(String[] args) {// classes in java.lang should not necessarily be imported.
		// class with final can not be extended.
		// string class can not be extended.
		//beloe is 5 ways to make string.
		
		
		
		//Implicit creation meaning without using constructor and not using new but
		// obj is created internaly
		String s1 ="Hello!";
		System.out.println(s1);
		
		//explicit creation with using constructor
		String s2 = new String();
		System.out.println(s2);
		
		String s3 = new String("Hello!");
		System.out.println(s3);
		
		char ch[] = {'a', 'b', 'c'};
		String s4 = new String(ch);
		System.out.println(ch);
		
		byte []bb= {65, 66, 67};
		String s5 = new String(bb);
		System.out.println(s5);
	}
}
