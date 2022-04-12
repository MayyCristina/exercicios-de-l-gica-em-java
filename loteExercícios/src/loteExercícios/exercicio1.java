package loteExercícios;

import javax.swing.JOptionPane;

public class exercicio1 {
	public static void main(String args[]) {
		long lado = 0;
		long area = 0;
		lado = Long.parseLong(JOptionPane.showInputDialog(null, "insira um lado do quadrado"));
		area = lado*lado;
		System.out.print("o resultado da area do quadrado e: "+area);
	}
}
