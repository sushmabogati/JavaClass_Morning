package day10;

import java.util.Scanner;

public class WhileLoopDemo2 {//runs till condition is true. Do while runs at least one// while ma condition true hunai parcha.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("What is your name");
			String name = input.next();
			System.out.println("oh!your name is: " + name);
			if (name.equals("Azol")) {
				flag = false;
				System.out.println("exit");
			}

		}
		input.close();
	}

}
