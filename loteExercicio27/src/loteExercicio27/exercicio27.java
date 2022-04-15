package loteExercicio27;

import javax.swing.JOptionPane;

public class exercicio27 {
	public static void main(String args[]) {
		int nvoltas = 0;
		int ecircuito = 0;
		int tduracao = 0;
		int velocidademedia = 0;
		nvoltas = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o numero de voltas"));
		ecircuito = Integer.parseInt(JOptionPane.showInputDialog(null,"insira a extensao do circuito"));
		tduracao = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o tempo de duracao"));
		velocidademedia = (nvoltas*ecircuito) / tduracao;
		System.out.print("a velocidade media vai ser de" +velocidademedia +"km/h");
	}
			
}
	


