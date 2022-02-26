package application;

import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		
		System.out.println("Digite um valor inteiro: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int A = 0; 
		int B = 0;
		
		for (int i = 0; i < num; i++) {
			
			if(i >= 10 && i <= 20) {
				A = A + 1;
			}
			else {
				B = B + 1;
			}

		}
		
		System.out.println(A + "in");
		System.out.println(B + "out");
		
		scan.close();
	}
}
