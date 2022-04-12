package loteExercicio20;

import javax.swing.JOptionPane;

public class exercicio20 {
	public static void main(String args[]) {
		double A = 0;
		double B = 0;
		double C = 0;
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		A = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o valor de A"));
		B = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o valor de B"));
		C = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o valor de C"));
		delta = (B*B) - (4*A*C);
		if(delta>=0) {
			x1 = (-B + Math.sqrt(delta))/(2*A);
			x2 = (-B - Math.sqrt(delta))/(2*A);
			System.out.print("as raizes sao:" +x1 +"e" + x2);
		}else {
			System.out.print("nao existem raizes reais");
		}
		
		
		
		
	}

}
