package application;

import java.util.Scanner;

import entities.Funcionario;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		
		System.out.print("Digite o nome: ");
		func.nome = scan.nextLine();
		
		System.out.print("Digite o salario bruto: ");
		func.salarioB = scan.nextDouble();
		
		System.out.print("Digite a quantidade de impostos com base no salário: ");
		func.imposto = scan.nextDouble();

		System.out.println();
		System.out.println("Funcionario: " + func);
		System.out.print("Digite uma taxa de aumento: ");
		double taxa = scan.nextDouble();
		func.aumentaSal(taxa);
		
		System.out.println();
		System.out.println("Atualização: " + func);
		
		scan.close();
		
		
		
	}

}
