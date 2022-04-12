package loteExercicios3;

import javax.swing.JOptionPane;

public class exercicio3 {
	public static void main(String args[]) {
		int base = 0;
		int altura = 0;
		int area = 0;
		base = Integer.parseInt(JOptionPane.showInputDialog(null, "insira a base"));
		altura = Integer.parseInt(JOptionPane.showInputDialog(null, "insira a altura"));
		area = (base*altura)/2;
		System.out.print("o resultado da area e:"+area + "a sua base foi:"+base + "a sua altura foi:"+altura);
	}
}
