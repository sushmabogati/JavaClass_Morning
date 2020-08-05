package day21;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 ="Nepal";
		String s2 = "Nepal";
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		System.out.println(s1==s2);//== operator always checks if it refers to same or not. s1 and s2 refer to same hello in literal pool.
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		//in order to check content wise the java lang has a method called .equals
		//for string comparison use these.
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		String s5 = new String("nepal");
		System.out.println(s1.equals(s5));//false
		//to check content and ignore case
		System.out.println(s1.equalsIgnoreCase(s5));//true
		
	}
	
	/*String s1 = "Nepal"
	sout(s1(0))- can not do this in java
	sout(s1[0])-can not do this	 */
	
}



