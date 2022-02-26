package application;

import java.util.Locale;
import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores para a operação: ");
		int X, Y, soma;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		soma = X + Y;
		
		System.out.println("O valor da operação é: " + soma);
		
		System.out.println("-------------------------------");
		
		System.out.println("Digite o valor do raio: ");
		double R, area, pi = 3.14159;
		
		R = sc.nextInt();
		
		area = pi * (R * R);
	
		System.out.print("O valor da area do circulo é: ");
		System.out.printf("%.4f%n", area);
		
		
		System.out.println("-------------------------------");
		
		
		System.out.println("Digite 4 valores para a operação: ");
		int A, B, C, D, op;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		op = (A * B) - (C * D);
		
		System.out.printf("O valor da operação é: " + op);
		
		
		sc.close();

	}

}
