package application;

import java.util.Scanner;

public class ExercicioFor10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		int linha, quad, cubo, num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			linha = i;
			quad = i * i;
			cubo = i * i * i; 
			
			System.out.printf("%d %d %d%n", linha, quad, cubo);
		}

	}

}
