package entities;

public class Funcionario {
	
	public String nome;
	public double salarioB;
	public double imposto;
	
	public double calcSalario() {
		return salarioB - imposto;
	}
	
	public void aumentaSal(double taxa) {
		salarioB += salarioB * taxa / 100;
		
	}
	
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.2f%n", calcSalario());		
	}
}
