package loteExercicio29;

import javax.swing.JOptionPane;

public class exercicio29 {
	public static void main(String args[]) {
		double investimento = 0.0;
		double valorCorrigido = 0.0;
		int tipoInvestimento = 0;
		tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o tipo de investimento (1 = poupança e 2 = renda fixa)"));
		investimento = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o valor do investimento"));
		if(tipoInvestimento == 1) {
			valorCorrigido = investimento * 1.03;	
			System.out.print("o valor corrigido da poupanca sera: "+valorCorrigido +" reais");
		}if(tipoInvestimento == 2) {
			valorCorrigido = investimento * 1.05;
			System.out.print("o valor corrigido da renda fixa sera: "+valorCorrigido +" reais");
		}
	}

}
