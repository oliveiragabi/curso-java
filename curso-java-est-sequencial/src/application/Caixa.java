package application;

import java.util.Locale;
import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int codPeca, codPeca2, numPeca, numPeca2;
		double valorPeca, valorPeca2, total;
		
		System.out.print("Digite o codigo da peça 1: ");
		codPeca = scan.nextInt();
		
		System.out.print("Digite a quantidade de peças 1: ");
		numPeca = scan.nextInt();

		System.out.print("Digite o valor unitário 1: ");		
		valorPeca = scan.nextDouble();
		
		System.out.println("------------------------------");
		
		System.out.print("Digite o codigo da peça 2: ");
		codPeca2 = scan.nextInt();
		
		System.out.print("Digite a quantidade de peças 2: ");
		numPeca2 = scan.nextInt();
		
		System.out.print("Digite o valor unitário 2: ");
		valorPeca2 = scan.nextDouble();
		
		System.out.println("------------------------------");
		
		total = (numPeca * valorPeca) + (numPeca2 * valorPeca2);
		System.out.printf("O valor a pagar é: R$ %.2f%n ", total);
		
	}

}
