package loteExercicios8;

import javax.swing.JOptionPane;

public class exercicio8 {
	public static void main(String args[]) {
		double deposito = 0.0;
		double valor = 0.0;
		double taxa = 0.013;
		deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o deposito"));
		valor = deposito + deposito * 0.013;
		System.out.print("o valor apos 1 mes de aplicaçao e:"+valor);
		
	}

}
