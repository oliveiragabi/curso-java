package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o codigo do tipo de combustível: " );

		Scanner scan = new Scanner(System.in);
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
		int cod = scan.nextInt();
		
		while(cod != 4) {
			if(cod == 1) {
				alcool = alcool + 1;
			} 
			else if (cod == 2) {
				diesel = diesel + 1;
			}
			else if(cod == 3) {
				gasolina = gasolina + 1;
			}
			
			cod = scan.nextInt();
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Qtd que usa álcool: " + alcool);
		System.out.println("Qtd que usa diesel: " + diesel);
		System.out.println("Qtd que usa gasolina: " + gasolina);
		
		
	}
}