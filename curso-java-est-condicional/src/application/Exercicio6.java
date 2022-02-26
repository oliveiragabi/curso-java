package application;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		float num = scan.nextInt();
		
		if(num < 0.00 || num > 100) {
			System.out.println("Número fora do intervalo.");
		}
		else if(num <= 25.00) {
			System.out.println("Dentro do intervalo [0,25]");
		}
		else if(num <= 50.00) {
			System.out.println("Dentro do intervalo (25,50]");
		}
		else if(num <= 75.00) {
			System.out.println("Dentro do intervalo (50,75]");
		}
		else {
			System.out.println("Dentro do intervalo (75,100]");
		}
		
		scan.close();
		
	}
}
