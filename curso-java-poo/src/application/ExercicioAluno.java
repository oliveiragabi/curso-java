package application;

import java.util.Scanner;

import entities.Aluno;

public class ExercicioAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		
		System.out.print("Digite seu nome: ");
		aluno.nome = scan.nextLine();
		
		System.out.print("Digite sua nota do primeiro trimestre: ");
		aluno.nota1 = scan.nextDouble();
		
		System.out.print("Digite sua nota do segundo trimestre: ");
		aluno.nota2 = scan.nextDouble();
		
		System.out.print("Digite sua nota do terceiro trimestre: ");
		aluno.nota3 = scan.nextDouble();
		
		System.out.println("A grade final é: " + aluno.calcNota());
		
		if(aluno.calcNota() <= 60) {
			System.out.println("Não passou :(");
			System.out.printf("Faltou %.2f pontos%n", aluno.aprovacao());
		}
		else {
			System.out.println("Passou! =D");
		}
		
		scan.close();
	}

}
