package day17;

public class Super {
	public Super() {//
		System.out.println("Thid calls Parents's default constructer");// if no constructer is declared then the compiler itself
															// gives constructer. The constructer with no argument is
															// calle default constructer

	}

	public Super(int i) {
		System.out.println("This calls Parent's argument constructer");
	}
}
