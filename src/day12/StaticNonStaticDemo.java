package day12;

public class StaticNonStaticDemo {
	String nonStaticVar = "This is non static variable";
	static String staticVar = "This is static variable!";

	public static void main(String[] args) {
		StaticNonStaticDemo ob = new StaticNonStaticDemo();
		ob.sayHelo();// calling non-static method. It requires object to be called.
		sayHi();// calling static method by name. It does not require object to be called. This
				// is not best approach. a static method can be called this way only with in a
				// class. But this is not best approach. Static method should always be called
				// using class name. That is not the best method.
		// limited approach. Only with the same class.
		StaticNonStaticDemo.sayHi();// Best approach to call a static method.
		System.out.println(ob.nonStaticVar);
		System.out.println(StaticNonStaticDemo.staticVar);
//static non static inner class bhitra garna milcha tara constructer aghi garna mildaina
	}

	// non-static method
	public void sayHelo() {
		System.out.println("Hi! From  Nepal");
	}

	// static method
	public static void sayHi() {
		System.out.println("Hello! From USA");

	}

}
