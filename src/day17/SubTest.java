package day17;

public class SubTest {
	public static void main(String[] args) {
		Sub obj = new Sub();//this calls the default constructor
		
		System.out.println("=============");
		Sub ob = new Sub(5);
	
	}

}
//Theoretically constructor is not inheritated
//but here in praticality first parents constructer is called  and then childs
