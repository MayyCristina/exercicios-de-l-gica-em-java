package loteExercicios5;

import javax.swing.JOptionPane;

public class exercicio5 {
	public static void main(String args[]) {
		/**
		 * exercicio formula de bhaskara
		 * 
		 */
		double A = 0.0;
		double B = 0.0;
		double C = 0.0;
		double delta = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		A = Double.parseDouble(JOptionPane.showInputDialog(null,"coeficiente A"));
		B = Double.parseDouble(JOptionPane.showInputDialog(null,"coeficiente B"));
		C = Double.parseDouble(JOptionPane.showInputDialog(null,"coeficiente C"));
		delta = (B*B) - (4*A*C);
		
		x1 = (-B + Math.sqrt(delta))/(2*A);//sqrt = raiz quadrada
		x2 = (-B - Math.sqrt(delta))/(2*A);//round = arredondar numero
		
		System.out.print("as raizes sao:" +x1 +"e" + x2);
		
		
		
		
	}

}
