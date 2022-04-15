package mensagemdialogo;

import javax.swing.JOptionPane;

public class nene {
	public static void main(String args[]) {
		int nene1 = 0;
		int nene2 = 0;
		int nener = 0;
		nene1 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		nene2 = Integer.parseInt(JOptionPane.showInputDialog(null,"insira um numero"));
		nener = nene1 * nene2;
		JOptionPane.showMessageDialog(null, "o resultado foi " + nener);
	}
	
	
	
	

}
