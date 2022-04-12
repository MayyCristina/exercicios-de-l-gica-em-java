package loteExercicios2;

import javax.swing.JOptionPane;

public class exercicio2 {
	public static void main(String args[]) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o salario"));
		double reajuste = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o reajuste"));
		salario = salario + (salario*reajuste);
		System.out.print("o resultado do salario e:"+salario);
	}
}
