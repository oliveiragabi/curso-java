package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ExercicioRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo re = new Retangulo();

		System.out.println("Digite lados do retangulo: ");
		re.a = scan.nextDouble();
		re.b = scan.nextDouble();
		
		double areaR = re.area();
		double perimetroR = re.perimetro();
		double diagonalR = re.diagonal();
		
		System.out.println("A �rea do ret�ngulo �: " + areaR);
		System.out.println("O per�metro �: " + perimetroR);
		System.out.println("A diagonal �: " + diagonalR);

	}

}
