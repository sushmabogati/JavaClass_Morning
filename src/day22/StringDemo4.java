package day22;

import day3.ConCatDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Good  Morning!";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("d"));
		System.out.println(s1.contains("r"));
		System.out.println(s1.contains("Good"));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.concat("World"));
		System.out.println("hi!".concat(s1));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char ch[] = s1.toCharArray();
		System.out.println(ch[0]);
		System.out.println(s1.replace("Morning", "Evening"));
		String s2 = " Sushma Bogati ";
		System.out.println(s2.trim());
		if(s1.compareTo("Good Morning!")==0) {
			System.out.println("Both strings are  equal");
		}else {
			System.out.println("both strings are nto equal");
		}
	}

}
