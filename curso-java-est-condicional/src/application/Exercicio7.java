package application;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite dois pontos (X, Y) de um plano cartesiano ");
		Scanner scan = new Scanner(System.in);
		
		double X = scan.nextDouble();
		double Y = scan.nextDouble();
		
		if( X == 0 && Y == 0) {
			System.out.println("Os pontos estão na origem");
		} 
		else if(X == 0) {
			System.out.println("O ponto esta no eixo Y");
		}
		else if(Y == 0) {
			System.out.println("O ponto esta no eixo X");
		}
		else if(X > 0 && Y > 0) {
			System.out.println("Os pontos estão no primeiro quadrante (1Q)");
		}
		else if(X > 0 && Y < 0) {
			System.out.println("Os pontos estão no quarto quadrante (4Q)");
		}
		else if(X < 0 && Y > 0) {
			System.out.println("Os pontos estão no segundo quadrante (2Q)");
		}
		else {
			System.out.println("Os pontos estão no terceiro quadrante (3Q)");
		}
		
		scan.close();

	}

}
