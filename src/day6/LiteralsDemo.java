package day6;

public class LiteralsDemo {

	public static void main(String[] args) {
		// literals are fixed value +data type
		//types
		//1.Integers Literal 3432 4657 54765786876 23432543654567 (int)
		byte b = 127;
		short s = 32767;
		int i =2147483647;
		long l1 = 2147483647;//long numbers in the range of int necessarily don't need l. Java understand this range as int. 
		//if this range is increased even by 1 then forcefully we are making java understand it is Long by writing capital L or small l.
		long l2 = 2147483648l;//2147483648 without L shows error.
		//2.floating literal
		float f = 23.45f;//23.45 is understood as double by java so, we have to make it forcefully understand that it is float by writing f at the end.
		double d =23.35;
		//3.boolean literal
		boolean bb1 = true;
		boolean bb2 = false;
		//4.Character Literal
		/*everything in single quote is a character
		 * '1', '/', 'a', '?'*/
		char c1 ='1';
		char c2 ='a';
		//not more then one character is allowed to be written inside single quote.
		//but unicode can have more then one character inside a single quote.
		char c3 = '\u0000';//unicode convention. 1 is written as char c3 = '\u0001'; likewise 2 is written as char c3 = '\u0002';
		//5.String literall. Anything written inside double quote. eg. " ", "Nepal", "3897vhrhr-"
		String s1 = "Nepal";
		String s2 = "1234";
		String s3 = " ";
		String s4 = "23.45";
		String s5 ="a";
		String s6="Hello! I am Sushma Bogati.";
		String s7 = "?";
		//Null literal null
		String s8 = null;
		LiteralsDemo ob = new LiteralsDemo();//this is an object in java.
		//if you don't want to give an object then you can give null.
		LiteralsDemo obb = null;
		//In above String is a library class.
		
		

	}

}
