package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um n�mero: ");
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = scan.nextInt();
		
		System.out.println((num % 2 == 0) ? "Valor par" : "Valor �mpar");
		
		scan.close();
	}

}
