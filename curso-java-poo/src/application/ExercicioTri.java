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

		System.out.println("Digite valores para o tri�ngulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Digite os valores para o tri�ngulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
				
		System.out.println("A �rea de X �: " + areaX);
		System.out.println("A �rea de Y �: " + areaY);

		if(areaX > areaY) {
			System.out.println("A maior area � do Tri�ngulo X");
		}
		else {
			System.out.println("A maior area � do Tri�ngulo Y");
		}
		
		
		

	}

}
