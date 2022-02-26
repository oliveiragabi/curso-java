package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ExercicioTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite valores para o triângulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Digite os valores para o triângulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
				
		System.out.println("A área de X é: " + areaX);
		System.out.println("A área de Y é: " + areaY);

		if(areaX > areaY) {
			System.out.println("A maior area é do Triângulo X");
		}
		else {
			System.out.println("A maior area é do Triângulo Y");
		}
		
		
		

	}

}
