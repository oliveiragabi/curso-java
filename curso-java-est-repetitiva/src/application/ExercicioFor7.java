package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor7 {
	public static void main(String[] args) {
		
		System.out.printf("Digite um n�mero: ");
		Scanner scan = new Scanner(System.in);
		
		int  num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			System.out.print("Digite " + num + " pares de n�meros: ");
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(b == 0) {
				System.out.println("A divis�o n�o � poss�vel");
			}
			else {
				double result = (double) a / b;
				System.out.println("O resultado �: " + result);
			}
		
		}
		
		scan.close();
	}
}
