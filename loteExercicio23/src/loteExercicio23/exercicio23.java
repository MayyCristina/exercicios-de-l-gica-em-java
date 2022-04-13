package loteExercicio23;

import javax.swing.JOptionPane;

public class exercicio23 {
	public static void main(String arg[]) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		if(num4>num3) {
			System.out.print(num1 +","+ num2 +","+ num3 +","+ num4);
		}else if(num4 < num3 && num4 > num2) {
			System.out.print(num1 +","+ num2 +","+ num4 +","+ num3);
		}else if(num4 > num1 && num4 < num2) {
			System.out.print(num1 +","+ num4 +","+ num2 +","+ num3);
		}else if(num4 < num1) {
			System.out.print(num4 +","+ num1 +","+ num2 +","+ num3);
		}
	}
		
}


