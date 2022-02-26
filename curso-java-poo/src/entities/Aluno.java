package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calcNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double aprovacao() {
		if(calcNota() < 60) {
			return 60.0 - calcNota();
		}
		else {
			return 0.0;
		}
	}
	

}
