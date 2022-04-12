package loteExercicio17;

import javax.swing.JOptionPane;

public class exercicio17 {
	public static void main(String args[]) {
		int tempo = 0;
		int velocidadeMedia= 0;
		int distancia = 0;
		int litrosUsado = 0;
		tempo = Integer.parseInt(JOptionPane.showInputDialog(null,"insira o tempo percorrido"));
		velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog(null,"insira a velocidade media"));
		distancia = tempo*velocidadeMedia;
		litrosUsado = distancia/12;
		System.out.print("quantidade de litros gastos na viagem e"+litrosUsado);
		
		
		
		
		
		
		
	}

}
