package day12;

public class ThisDemo2 {
	String name;
	int age;
	public ThisDemo2(String name, int age) {//local ra instance variable same tye and same name bhayo bhane shadowing huncha.
		this.name=name;
		this.age=age;
		
	}
	public void printInfo() {
		System.out.println("the name is "+name);
		System.out.println("the age is "+age);
	}

	public static void main(String[] args) {
		ThisDemo2 ob = new ThisDemo2("ram", 11);
		ob.printInfo();
	

	}

}
