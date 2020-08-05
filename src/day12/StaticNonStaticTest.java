package day12;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In java, anything from one class can be called to another class depending on the access  modifier type.
		StaticNonStaticDemo ob = new StaticNonStaticDemo();
		ob.sayHelo();
		StaticNonStaticDemo.sayHi();
		
		System.out.println(ob.nonStaticVar);
		System.out.println(StaticNonStaticDemo.staticVar);

	}

}
