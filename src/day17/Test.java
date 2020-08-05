package day17;

public class Test {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.sayHello();
		System.out.println(parent.name);
		System.out.println("==========");
		Child child = new Child();
		child.sayHello();
		System.out.println(child.name);// since the variable is called through child obj it gives data in the variable
										// in child class.
	}

}
/*
 * private member- Non-static method and variable inside a class. Variable is
 * objects data and method is objects behavior. Private members can not be
 * inheritated
 */
/*
 * hidden variable- the data in a variable in parent class can be changed in
 * child class. Hidden Variable inherit hunna. In such case the child varibale
 * is hidding variable and the parent variable is called hidden variable
 */

/*
 * overridden method- the method in parent class can be changed in child class.
 * This is called overriding. Contract should be same in order for it to be
 * overidden meaning the acccess modifier, return type static or non static and
 * method name and arguments list. Overridden cases are not inherited.
 */
