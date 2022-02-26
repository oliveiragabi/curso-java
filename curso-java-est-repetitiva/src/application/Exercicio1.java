package application;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a senha: ");
		Scanner scan = new Scanner(System.in);
		
		int senha = scan.nextInt();
		int valor = 2002;
		
		while(senha != valor) {
			System.out.println("Acesso negado!");
			senha = scan.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		scan.close();
	}

}
