package application;

import java.util.Scanner;

public class ExercicioFor8 {

	public static void main(String[] args) {
		
		System.out.printf("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		int  fat = 1;
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			fat = fat * i;	
		}
		
		System.out.println("Resultado: " + fat);

		
		scan.close();
	}
}
