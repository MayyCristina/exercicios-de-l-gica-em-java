package loteExercicio19;

import javax.swing.JOptionPane;

public class exercicio19 {
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
		int maior = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		if(num1 > num2) {
			maior = num1;
		}else if(num2 > num1) {
			maior = num2;
		}else {
			System.out.print("se os numeros sao iguais entao nao tem maior");
			System.exit(0);
		}
		System.out.print("maior numero e="+maior);
	}

}      
