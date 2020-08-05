package day18;

public /*abstract*/ interface InterfaceDemo1 {
	void m1();
	public void m2();
	abstract void m3();
	public abstract void m4();
	int a =8;
	public int a1 =8;
	static int a2 =8;
	final int a3 =8;
	public static int a4 =8;
	static final int a6 =8;
	public final int a7 =8;
	public static final int a8 =8;//by default

}
//Interface is by default  public abstract.  If we do not write it then compiler ll .
//abstract can be written before interface. If we dont then compiler will write
//All the variables inside the interface class is final.
//abstract class ma constructor banauna milha.
//method with body can not be made here
//Interface class can not have constructor
//Interface needs another class to be implemented.


