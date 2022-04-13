package loteExercicio24;

import javax.swing.JOptionPane;

public class exercicio24 {
	public static void main(String args[]) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero"));
		if(numero % 2 == 0) {
			System.out.println("esse numero e divisivel por 2");
		}else {
			System.out.println("esse numero nao e divisivel por 2");
		}
		if(numero % 3 == 0) {
			System.out.println("esse numero e divisivel por 3");
		}else {
			System.out.println("esse numero nao e divisivel por 3");
		}
	}

}
