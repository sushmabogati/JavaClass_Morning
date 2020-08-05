package day23;

public class ErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int []  arr= new int[1000000000];//give meroy error. Error can not be handled in try catch.
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
//compile time exception is checked exception-file handling exceptions
//runtime exception is unchecked exception

