package day7;

public class OperatorDemo5 {
	public static void main(String[] args) {
		//Logical operator
		//&&(and) ||(or) !(not)
		System.out.println(true&&true);//true  //these are short circuit logical operator.//both conditions has to be true
					//meaning if condition 1 is true then only it will go to condition 2. because for this both condition have to be true.
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false//these are short circuit logical operator. 
		//meaning if condition 1 is true then only it will go to condition 2. because for this both condition have to be true.
		//If first condition is false it will not check condition2.
		System.out.println(false&&false);//false
		
		System.out.println(true||true);//true one condition has to be true.
		System.out.println(true||false);//true
		System.out.println(false||true);//true
		System.out.println(false||false);//false
		
		System.out.println(!true);//false
		System.out.println(!false);//true
	
	}

}
