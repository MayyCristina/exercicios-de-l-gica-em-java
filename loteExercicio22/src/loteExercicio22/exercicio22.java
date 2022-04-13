package loteExercicio22;

import javax.swing.JOptionPane;

public class exercicio22 {
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		if(num2>num1) {
			System.out.print(num1 +","+ num2);
		}else if(num1>num2) {
			System.out.print(num2 +","+ num1);
		}else {
			System.out.print("os numeros sao iguais");
		}
			
	
	}
}

