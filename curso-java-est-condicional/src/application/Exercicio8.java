package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor do seu salário: ");
		Scanner scan = new Scanner(System.in);
		
		double salario = scan.nextFloat();
		double imposto;
		
		if(salario <= 2000.0) {
			imposto = 0.0;
		}
		else if(salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} 
		else if(salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(imposto == 00.00) {
			System.out.println("Você está isento");
		}
		else{
			System.out.printf("O valor a pagar é:  R$ %.2f%n", imposto);
		}
		
	}

}
