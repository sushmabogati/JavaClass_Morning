package day18;

public class Test2 {
	public static void main(String[] args) {
		//we can not instatntiat interface. //InterfaceDemo1 id = new InterfaceDemo1();
		InterfaceDemo1 id = new InterfaceImpl();//In order to keep the object of implementing class Interface can have referance variable.
		id.m1();
	}

}
