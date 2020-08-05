package day9;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 14;
		int b = 5;
		if(a>b){//if this condition inside small braces  is true then execute the code inside this curley braces. If it is true then  another if condition i s not required.
			System.out.println("a is greater then b");
//if first condition is true the checking another condition is just creating redundancy.
			//here adding another lines of code eg. if(b>a){System.out.println("b is greater then a ")} would be redundancy.
			
	}else {
		System.out.println("b is greater then 2");
		}
		System.out.println("more code");
        System.out.println("exit");	}

}
