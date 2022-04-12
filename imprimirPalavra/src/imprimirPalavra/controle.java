package imprimirPalavra;

import javax.swing.JOptionPane;

public class controle {
	
	public static void main(String args[]) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um valor"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"insira outro valor"));
		int soma = 0;
		soma = a+b;
	
		System.out.print("mayara linda " + soma);
	} 
}
