package application;

import java.util.Iterator;
import java.util.Scanner;

public class ExercicioFor4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número de 1 a 1000");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {

			if(i % 2 == 0) {
				i++;
			}
			System.out.println(i);
		}
		
		

	}
}
