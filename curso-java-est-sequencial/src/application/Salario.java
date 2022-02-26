package application;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu numero, suas horas trabalhadas e o valor que recebe por hora:");
		
		double valorHora, salario;
		int num, horas;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Numero = " + num);
		System.out.printf("Salario = U$ %.2f%n", salario);
	}

}
