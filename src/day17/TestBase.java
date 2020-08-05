package day17;

public class TestBase {
public static void main(String[] args) {
	Derived obj = new Derived();

	obj.sayHi();
	obj.getClass();
	System.out.println(	obj.getClass());//this gives class day17.Derived
	System.out.println();
	System.out.println("===========");
	
	//object casting
	//Object upcasting
	Base parent = new Derived();//this gives run time polymorphism
	parent.sayHi();
	//parent.greet();
	
	//object downcasting
	Base base = new Base();
	Derived d = (Derived)base;
}
}
//Object is the root class of all the java classes. All the classes in java are extended fron the root class called object. 
//when we dont write extend compiler implicitly writes it for us.
