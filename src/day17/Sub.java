
package day17;

public class Sub extends Super {
	public Sub() {//
		//During compiler, compiler calls super constructor even if we don't not call it
		super(5);//we can do this to explicitly call argumented constructor
		System.out.println("This calls child's default constructer");// if no constructer is declared then the compiler itself
															// gives constructer. The constructer with no argument is
															// Called default constructor

	}

	public Sub(int i) {
		super();//During compilation, even if we don't not call super(); compiler itself will call the super constructor.
		System.out.println("this calls child's argument constructer");
	}
}
