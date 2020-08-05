package day23;

public class ExceptionDemo8 {
	public static void main(String[] args) {//exception explicitly throw
		vote(23);
		System.out.println("end");
	}
	public static void vote(int age) {
		if(age>=18) {
			System.out.println("You can vote");
		}else {
			throw new InvalidAgeException("you can not vote");
		}
		
	}

}
