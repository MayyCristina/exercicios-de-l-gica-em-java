package loteExercicios32;

import javax.swing.JOptionPane;

public class exercicio32 {
	public static void main(String args[]) {
		long fatorial = 1;
		long inicial = 0;
		long valor = 0;
		valor = Long.parseLong(JOptionPane.showInputDialog(null,"Insira um n�mero"));
		for (inicial = 1; inicial <= valor ; inicial++) {
			fatorial = fatorial * inicial;
			System.out.print("O fatorial de " + inicial + " �: "+ fatorial + ("\n"));
		}
		
	}

}
