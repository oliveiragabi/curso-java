package application;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = scan.nextInt();
		
		System.out.println((num < 0) ? "Valor negativo" : "Valor positivo");
		
		scan.close();
	}

}
