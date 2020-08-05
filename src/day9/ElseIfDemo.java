package day9;

public class ElseIfDemo {
public static void main(String[] args) {
	int marks = 45;
	if(marks<0||marks>100) { //first condition marks i.e 45<0 is false so it check another condition 45>100 because it is short circuit logical operator.//is 45<0 or >100 if yes code inside curley braces is executed. if not goes to another line of code
		System.out.println("invalid marks");

	}
		else if(marks>=80&&marks<=100){//if marks>=80 is false it dont check second condition. it wouis 45>=80 and less then 100 if true code inside curley braces is executed. 
			System.out.println("distinction!! ");
		}
	else if(marks>=60&&marks<80){
		System.out.println("first division!!");			
	
	}
	else if(marks>=50&&marks<60){
		System.out.println("second division!!");
		}
	else if(marks>=40&&marks<50) {
		System.out.println("third division");
	
}else {
	System.out.println("fail!!");
}//if no conditions are met then it goes to code below.
	System.out.println("more code");
	System.out.println("exit");
}

		// TODO Auto-generated method stub
	/*	if(condition-1) {

	}
		else if(condition-2){
		}
	else if(condition-3){
	
	}
	else if(condition-n){
		}*/
		

	}
	
