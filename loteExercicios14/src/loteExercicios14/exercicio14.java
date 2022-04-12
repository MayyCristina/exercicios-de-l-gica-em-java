package loteExercicios14;

import javax.swing.JOptionPane;

public class exercicio14 {
	public static void main(String args[]) {
		int a = 0;
		int b = 0;
		int ta = 0;
		a = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o angulo"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o angulo"));
		ta = 180-(a+b);
		System.out.print("o valor do terceiro angulo e:"+ta);
		
		
	}

}
