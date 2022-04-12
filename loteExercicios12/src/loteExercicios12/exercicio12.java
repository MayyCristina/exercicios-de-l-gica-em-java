package loteExercicios12;

import javax.swing.JOptionPane;

public class exercicio12 {
	public static void main(String args[]) {
		int at = 0;
		int as = 0;
		int i = 0;
		at = Integer.parseInt(JOptionPane.showInputDialog(null,"ano atual"));
		as = Integer.parseInt(JOptionPane.showInputDialog(null,"ano de nascimento"));
		i = (at-as)+17;
		System.out.print("a sua idade daqui a 17 anos sera:"+i);
		
	}

}
