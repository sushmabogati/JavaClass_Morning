package day18;

public class Test {
	public static void main(String[] args) {
		Shape shape;//This is referance variable
	
		System.out.println("===============");
		//Triangle triangle =new Triangle();
		shape = new Triangle();
		shape.draw();
		System.out.println("===========");
		//Circle circle = new Circle();
		shape =  new Circle();
		//circle.draw();
		shape.draw();
		
		
		
	}

}
