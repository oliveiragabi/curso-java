package application;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o código e a quantidade do produto");
		Scanner scan = new Scanner(System.in);
		
		int cod =  scan.nextInt();
		int quantidade = scan.nextInt();
		double total;
		
		if(cod == 1) {
			total = quantidade * 4.00;
		} 
		else if(cod == 2){
			total = quantidade * 4.50;
		}
		else if(cod == 3){
			total = quantidade * 5.00;
		}
		else if(cod == 4){
			total = quantidade * 2.00;
		}
		else{
			total = quantidade * 1.50;
		}
		
		System.out.printf("O valor é:  %.2f%n ",  total);
		
		scan.close();
		
	}
}
