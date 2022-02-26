package application;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a hora que o jogo começou e terminou: ");
		Scanner sc = new Scanner(System.in);
		float horaFinal, horaInicial, total;
		
		horaInicial = sc.nextFloat();
		horaFinal = sc.nextFloat();
		
		total = horaFinal - horaInicial;
		
		System.out.printf("O jogo durou: " + total + " horas");
		
		sc.close();
		
	}

}
