package application;

import java.util.Locale;
import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 valores para os cálculos: ");
		
		float A, B, C, areaC, areaQ, areaT, areaTra, areaR;
		double pi = 3.14159;
		
		A = scan.nextFloat();
		B = scan.nextFloat();
		C = scan.nextFloat();
		
		areaT = (B * A)/2;
		areaC = (float) (pi * (C * C));
		areaTra = (A + B) * C/2;
		areaQ = B * B;
		areaR = A * B;
		
		System.out.printf("Área do triângulo: %.3f%n ", areaT);
		System.out.printf("Área do círculo:  %.3f%n ", areaC);
		System.out.printf("Área do trapézio:  %.3f%n ", areaTra);
		System.out.printf("Área do quadrado:  %.3f%n ", areaQ);
		System.out.printf("Área do retângulo:  %.3f%n ", areaR);
		
		
		
	}
}
