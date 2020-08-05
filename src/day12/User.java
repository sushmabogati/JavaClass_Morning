package day12;

public class User {
	

		String name;
		int age;
		public User(String n, int a) {
			name =n;
			age = a;
			System.out.println("construter called");
			//contructer has same name as class name
			//constructer dont have return type
			//constructer is called for each obj
			//in a class one or more constructer can be made.
			//there is onlyone default constructer with no arguments but there can be many other constructer.
		}
		public void printInfo() {
			System.out.println("user's name is "+name);
			System.out.println("user's age is "+age);
		}
		public static void main(String[] args) {
			User user1 = new User("sushma", 22);
			user1.printInfo();
			
		 user1 = new User("maya", 22);//user one is holding another object now. It is not same as user1 above.
			user1.printInfo();
			
			
			
		}
		
		

		

}
