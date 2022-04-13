package loteExercicio26;

import javax.swing.JOptionPane;

public class exercicio26 {
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		if(num1 % num2 == 0) {
			System.out.print("os numeros sao multiplos");
		}else
			System.out.print("os numeros nao sao multiplos");
	}

}
