package udemyExercicio;

import java.util.Scanner;

public class udemy1 {
	public static void main(String args[]) {
		//vari�veis
		int n, maior = 3;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("informe o n�mero: ");
		n = teclado.nextInt();
		
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("informe o n�mero: ");
			n = teclado.nextInt();
		}
		System.out.printf("o maior n�mero � %d", maior);
		teclado.close();
		
	}

}
