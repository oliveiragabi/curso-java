package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite dois n�meros: ");
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		scan.close();
	}

}
