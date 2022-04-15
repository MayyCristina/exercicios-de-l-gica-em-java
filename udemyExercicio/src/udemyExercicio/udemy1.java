package udemyExercicio;

import java.util.Scanner;

public class udemy1 {
	public static void main(String args[]) {
		//variáveis
		int n, maior = 3;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("informe o número: ");
		n = teclado.nextInt();
		
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("informe o número: ");
			n = teclado.nextInt();
		}
		System.out.printf("o maior número é %d", maior);
		teclado.close();
		
	}

}
