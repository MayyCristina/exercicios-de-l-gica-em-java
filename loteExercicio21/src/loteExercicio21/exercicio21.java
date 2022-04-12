package loteExercicio21;

import javax.swing.JOptionPane;

public class exercicio21 {
	public static void main(String args[]) {
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double nota4 = 0.0;
		double media = 0.0;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a terceira nota"));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a quarta nota"));
		media = (nota1+nota2+nota3+nota4)/4;
		if(media>=6.0) {
			System.out.print("aprovado");
		}else if(media>=3.0) {
			System.out.print("exame");
		}else 
			System.out.print("retido");
		}
	}

