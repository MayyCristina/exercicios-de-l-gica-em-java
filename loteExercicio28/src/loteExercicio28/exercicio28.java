package loteExercicio28;

import javax.swing.JOptionPane;

public class exercicio28 {
	public static void main(String args[]) {
		double precoatual = 0.0;
		double mediamensal = 0.0;
		double novopreco = 0.0;
		precoatual = Double.parseDouble(JOptionPane.showInputDialog(null,"insira o preco atual do produto"));
		mediamensal = Double.parseDouble(JOptionPane.showInputDialog(null,"insira a media mensal do produto"));
		if(mediamensal < 500 && precoatual < 30) {
			novopreco = precoatual * 1.10;
			System.out.print("o novo preco sera de:"+novopreco);
					
		}else if((mediamensal >= 500 && mediamensal <1000) && (precoatual >= 30 && precoatual <80)) {
			novopreco = precoatual * 1.15;
			System.out.print("o novo preco sera de:"+novopreco);
		}else if(mediamensal>=1000 && precoatual >= 80) {
			novopreco = precoatual * 1.05;
			System.out.print("o novo preco sera de:"+novopreco);
		}else
			System.out.print("o preco nao foi mudado");
			
			
		}
	  
	}


