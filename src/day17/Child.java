package day17;

public class Child extends Parent {
	public String name = "Child's name";// this is hiding variable. It hides data in parent variable. The same variable
										// in parent class is hidden varible.
	// Child class extend Parent class and gets its features i.e variables and
	// methods from the parent. The Variable in parents can be rewritten in the
	// child class and the value can be changed in child class.
	public void sayHello() {
		System.out.println("Hello from Child");
	}

}
