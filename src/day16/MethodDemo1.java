package day16;

import java.lang.reflect.Method;

public class MethodDemo1 {

	public  void sayHello() {// zero argument is passed through it.
		System.out.println("hello");
		return;// for type void it is on to write it or its ok not to write it.

	}

	public   void greet(String name) {// Take name from here.
		System.out.println("hello!" + name + "Good Morning");

	}

	public static String returnInfo() {
		String name = "Sushma Bogati";
		String address = "Boudha, Nepal";

		return name + " " + address;
	}

	public static int findMax(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;

	}

	/*
	 * note:- All the above is method declaration. Only the main method is run.
	 * These declared methods has to be called in the main method. There are two
	 * ways for a method to be called. If the method is static call it by class
	 * name(it can be called directly too but that is not a good practice). If the
	 * method is non-static call it through class object.
	 * 
	 */

	public static void main(String[] args) {
		MethodDemo1 ob = new MethodDemo1();
		System.out.println("main method");
		ob.sayHello();
		ob.greet("Sushma");
		String r = MethodDemo1.returnInfo();
		System.out.println(r);
		int m = MethodDemo1.findMax(5, 4);
		System.out.println(m);

		// TODO Auto-generated method stub
		/*
		 * <Access Modifier> <return type> <methodName(0 to any number of arguments.It
		 * can be of any type.){ }
		 * 
		 * <Acess Modifier> <return type><methodName(0 to any number of arguments){
		 * 
		 * return type; }>
		 */
		/*
		 * Access modifier Types- Public, Private, Protected, if no access modifier is
		 * mentioned then it means the return type is default. Return is generally not
		 * written if the return type is void.
		 *  * Anything can be returned and argument can be anything
		 */

	}
}
