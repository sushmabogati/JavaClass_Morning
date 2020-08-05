//Another way to take input.
package day2;

import javax.swing.JOptionPane;

public class Calculator3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter Number1:"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Enter Number2"));
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div=a/b;
		JOptionPane.showMessageDialog(null, "the sum is "+sum);//sent null for now, we ll discuss this later.
		JOptionPane.showMessageDialog(null, "the substraction is "+sub);
		JOptionPane.showMessageDialog(null, "the multiplication is "+mul);
		JOptionPane.showMessageDialog(null, "the division is "+div);
	}

}
