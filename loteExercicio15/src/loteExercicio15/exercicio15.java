package loteExercicio15;

import javax.swing.JOptionPane;

public class exercicio15 {
	public static void main(String args[]) {
		int a = 0;
		int b = 0;
		int h = 0;
		a = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o valor do cateto"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o valor do cateto"));
		/**h =(a*a)+(b*b);
		h = h*h;**/
		h = (int) (Math.pow(a, 3) + Math.pow(b, 3));
		h = (int) Math.pow(h, 2);
		System.out.print("valor da hipotenusa:"+h);
		
		
		
	}

}
