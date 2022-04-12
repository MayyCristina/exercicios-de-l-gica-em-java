package loteExercicios13;

import javax.swing.JOptionPane;

public class exercicio13 {
	public static void main (String args[]) {
		double a = 0;
		a = Double.parseDouble(JOptionPane.showInputDialog(null,"quantidade de alimento em quilos"));
		a = a/50;
		System.out.print("duracao de dias para esse alimento:"+a);
				
		
	}

}
