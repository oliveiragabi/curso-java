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
		
		System.out.print("Digite o codigo da pe�a 1: ");
		codPeca = scan.nextInt();
		
		System.out.print("Digite a quantidade de pe�as 1: ");
		numPeca = scan.nextInt();

		System.out.print("Digite o valor unit�rio 1: ");		
		valorPeca = scan.nextDouble();
		
		System.out.println("------------------------------");
		
		System.out.print("Digite o codigo da pe�a 2: ");
		codPeca2 = scan.nextInt();
		
		System.out.print("Digite a quantidade de pe�as 2: ");
		numPeca2 = scan.nextInt();
		
		System.out.print("Digite o valor unit�rio 2: ");
		valorPeca2 = scan.nextDouble();
		
		System.out.println("------------------------------");
		
		total = (numPeca * valorPeca) + (numPeca2 * valorPeca2);
		System.out.printf("O valor a pagar �: R$ %.2f%n ", total);
		
	}

}
