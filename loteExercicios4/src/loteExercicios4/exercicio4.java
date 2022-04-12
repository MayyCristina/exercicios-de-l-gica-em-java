package loteExercicios4;

import javax.swing.JOptionPane;

public class exercicio4 {
	public static void main(String args[])	{
		double C = 0.0;
	    double F = 0.0;
	    C = Double.parseDouble(JOptionPane.showInputDialog(null,"Temperatura em C"));
	    F = (9*C+160)/5;
	    System.out.print("Temperatura convertida em F e: " +F);
	}

}
