package day6;

public class OperatorDemo6 {
	//ternary (conditional operator)
	public static void main(String[] args) {int a =4;
	int b = 3 ;
	if(a>b) {//true
		System.out.println("a is greater then b");
		
	}else {
		System.out.println("b is greater then a");
		
	}
	String s = (a>b)?"a is greater then b":"b is greater then a.";//Anything beside String can be return. 
	//It does not necessarily has to be String. For eg Boolean can also be returned
	System.out.println(s);
	boolean r = (a>b)?true:false;
	System.out.println(r);
		
	}
	

}
