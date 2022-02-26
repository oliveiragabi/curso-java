package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			
			double media = (a * 2) + (b * 3) + (c * 5) / 10;
			
			System.out.printf("Valor "  + media);
			
		}
	}
}
