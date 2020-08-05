package day22;

public class StringDemo8 {

	public static void main(String[] args) {
		System.out.println(isTrue("True"));
		System.out.println(isTrue("True"));
		// TODO Auto-generated method stub
		System.out.println(isEmail("abc"));
		System.out.println(isEmail("abc@gmail.com"));
		System.out.println(isNumberOnly("abc"));
		System.out.println(isNumberOnly("1"));

	}
	public static boolean isTrue(String s) {
		return s.matches("True|true");
		
	}
	public static boolean isTrueOrYes(String s) {
		return s.matches("True|true|Yes");
		
	}
	public static boolean isEmail(String s) {
		return s.matches("^(.+)@(.+)$");
		
	}
	public static boolean isNumberOnly(String s) {
		return s.matches("^[0-9]");
	}


}
//email regex in java.
