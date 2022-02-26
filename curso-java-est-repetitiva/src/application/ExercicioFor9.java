package application;

import java.util.Scanner;

public class ExercicioFor9 {

	public static void main(String[] args) {
		
		System.out.printf("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
