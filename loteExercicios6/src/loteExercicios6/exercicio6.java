package loteExercicios6;

import javax.swing.JOptionPane;

public class exercicio6 {
	public static void main(String args[]) {
		int x = 0;
		int y = 0;
		int t = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"valor de x"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"valor de y"));
		t = x;//troca = x ou y
		x = y;
		y = t;// y = t(x)
		System.out.print("valor de x e:"+x +"valor de y:"+y);
				
		
		
		
		
	}

}
