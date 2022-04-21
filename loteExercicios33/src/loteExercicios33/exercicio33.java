package loteExercicios33;

import javax.swing.JOptionPane;

public class exercicio33 {
	public static void main(String args[]) {
		double numero = 0;
		double count = 0;
		double resultado = 0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um número: "));
		for (count = 1; count <= numero; count++) {
			resultado += (1/count);
		}
		System.out.println("A série do número é:"+ resultado);
		
		
				
		
		
	}

}
