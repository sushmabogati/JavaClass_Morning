package day12;

public class ObjectDemo1 {
	public static void main(String[] args) {
		ObjectDemo1 ob = new ObjectDemo1();// similar to int a =5; type name(identifier) =(operator sign) new and
											// classname
		ObjectDemo1 ob1;// similar to int a; type and identifier.
		ob1 = new ObjectDemo1();// a= 5;
		// note:- object can be made inside main function, in programmed method outside
		// main method or in another clas...
		//object can be static or non-static.
		new ObjectDemo1();//this is anonymous object.
		ob.greet();
		ob1.greet();
		new ObjectDemo1().greet();
		//In java every object has their object id.

	}
	public void greet() {
		System.out.println("Goodmorning USA");
		
	}

}
