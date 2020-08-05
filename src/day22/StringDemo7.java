package day22;

import java.util.StringTokenizer;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String intro = "I am sushma Bogati,, from Dallas Texas. I am,, full stack developer, cosmetologist and BBA graduate ";
String [] words = intro.split(",");
System.out.println(words.length);
 for(String w : words) {
	 System.out.println(w);
 }
 System.out.println("==========");
 StringTokenizer st = new StringTokenizer(intro, ",");
 System.out.println(st.countTokens());
 while(st.hasMoreTokens()) {
	 System.out.println(st.nextToken());
 }
	}

}
