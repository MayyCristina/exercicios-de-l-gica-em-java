package loteExercicios9;

import javax.swing.JOptionPane;

public class exercicio9 {
	public static void main(String args[]) {
		int A = 0;
		int B = 0;
		int soma = 0;
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"valor de A"));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"valor de B"));
		soma = (A+B) * (A+B);
		System.out.print("soma dos quadrados e:"+soma);
		
		
	}

}
