package loteExercicio16;

import javax.swing.JOptionPane;

public class exercicio16 {
	public static void main(String args[]) {
		double horaTrabalhada = 0;
		double valorHora = 0;
		double desconto = 0;
		double descendentes = 0;
		double salario = 0;
		double salarioLiquido = 0;
		horaTrabalhada = Double.parseDouble(JOptionPane.showInputDialog(null,"quantidade de horas trabalhadas"));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,"valor por hora"));
		desconto = Double.parseDouble(JOptionPane.showInputDialog(null,"percentual de desconto"));
		descendentes = Double.parseDouble(JOptionPane.showInputDialog(null,"numero de descendentes"));
		salario = horaTrabalhada*valorHora;
		salarioLiquido = salario - desconto + (descendentes*100);
		System.out.print("o salario a receber sera:"+salarioLiquido);
		
		
		
		
		
		
	}

}
