package loteExercicio18;

import javax.swing.JOptionPane;

public class exercicio18 {
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
		int menor = 0;
		int maior = 0;
		int diferenca = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		if(num1 > num2) {
			maior = num1;
			menor = num2;
		}else if(num2 > num1) {
			maior = num2;
			menor = num1;		
		}else {
			System.out.print("os numeros sao iguais a diferenca e zero");
			System.exit(0);
		}
		diferenca = maior - menor;
		System.out.print("o resultado da diferenca entre o maior pelo menor e="+diferenca);
		
		
		
	}

}
