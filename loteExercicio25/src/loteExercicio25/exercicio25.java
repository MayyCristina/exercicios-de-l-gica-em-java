package loteExercicio25;

import javax.swing.JOptionPane;

public class exercicio25 {
	public static void main(String args[]) {
		double hi = 0.0;
		double hf = 0.0;
		double ht = 0.0;
		hi = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a hora de inicio do jogo"));
		hf = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a hora final do jogo"));
		if(hf<hi) {
			ht = (24 - hi) + hf;
			System.out.print("a duracao do jogo foi de:"+ht +"horas");
		}else if(hf>hi){
			ht = hf - hi;
			System.out.print("a duracao do jogo foi de:"+ht +"horas");
		}else  if(hf == hi){
			ht = 24;
			System.out.print("a duracao do jogo foi de:"+ht +"horas");
		}
		
	}

}
