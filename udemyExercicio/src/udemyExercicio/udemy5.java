package udemyExercicio;

import java.util.Scanner;

public class udemy5 {
	public static void main(String args[]) {
		//vari�veis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		//processamento
		while(nome.equals(senha)) {
			System.out.println("Erro: O nome de usu�rio e senha devem ser diferentes. ");
			//entrada
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
		teclado.close();
		
	}
	

}
