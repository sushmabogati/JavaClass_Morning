package day12;

public class ThisDemo1 {
	// instance variable
	int a = 5;

	public void display() {
		System.out.println(a);// gives 5
		int a = 6;// variable made inside a method is called local variable.Here the valuse of
					// instance variable i.e 5 is shadowed by local variable inside non-static
					// method or constructer of a class.. It is called shadowing
		// int sum=a+a give 6+6 =12
		int sum = a + this.a;// gives 12 but if we want one to take 5 and another a to take 6. To bring vale
								// of a from instance variable write this
								// This is keyword and implicit reference variable of current type and current
								// object. and is available is non-static method and constructer.
		System.out.println("the sum of instance variable and local variable a is " + sum);
	}

	public static void main(String[] args) {
		ThisDemo1 ob = new ThisDemo1();// the variable made with class is called reference variable. In reference
										// variable always an obj sits
		System.out.println("the object is " + ob);// this gives object id.
		ob.display();
		
		System.out.println("=============");
		ThisDemo1 ob1 = new ThisDemo1();// the variable made with class is called reference variable. In reference
		// variable always an obj sits
		System.out.println("the object is" + ob1);// this gives object id.
		ob1.display();

	}

}
//this is used in non satic method when shadowing happen or in constructer.
