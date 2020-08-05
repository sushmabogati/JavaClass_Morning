package day17;

public class Derived extends Base {
	String name = "Child's name";

	public void sayHi() {
		System.out.println(name);// this gives childs varibale name
		System.out.println(super.name);// this gives parents's variable
		System.out.println("Hi from child");
		super.sayHi();// this gives parents method
		// note super is similar to this.
		
		
	}
	public void greet() {
		System.out.println("good! Morning");
	}

}
//this is implicit reference variable  of current type and current object. and
//is availabe inside non static method and constructor of a class

//super. is implicit reference variable  of current type and current object. and
//is availabe inside non static method and constructor of a child class

//the class where we do not write extends compiler puts itself.