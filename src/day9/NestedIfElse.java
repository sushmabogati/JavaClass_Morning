package day9;

public class NestedIfElse {
	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		int c = 11;
		if(a>b) {
			if(a>c) {
				System.out.println("a is the greatest");
		}else {
			System.out.println("c is the greatest");
			
		}
		}else {
			System.out.println("b is greater then a but might be smaller or greater then c");
		}
	}

}
