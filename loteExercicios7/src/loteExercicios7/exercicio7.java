package loteExercicios7;

import javax.swing.JOptionPane;

public class exercicio7 {
	public static void main(String args[]) {
		double comprimento = 0;
		double largura = 0;
		double altura = 0;
		double volume = 0;
		comprimento = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o comprimento"));
		largura = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a largura"));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a altura"));
		volume = comprimento*largura*altura;
		System.out.print("o volume e:" +volume);
		
		
		
		
	}

}
