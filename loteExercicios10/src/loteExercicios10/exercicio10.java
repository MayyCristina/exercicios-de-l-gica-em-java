package loteExercicios10;

import javax.swing.JOptionPane;

public class exercicio10 {
	public static void main(String args[]) {
		int A = 0;
		int B = 0;
		int diferenca = 0;
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"numero de A"));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"numero de B"));
		diferenca = A - B;
		System.out.print("a diferenca entre os dois numeros e:"+diferenca);
				
		
	}

}
