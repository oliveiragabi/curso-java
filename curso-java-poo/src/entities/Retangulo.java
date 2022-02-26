package entities;

public class Retangulo {
	public double a;
	public double b;
	
	public double area() {
		double area = a * b;
		return area;
	}
	
	public double perimetro() {
		double p = 2 * (a + b);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt((a* a) + (b * b)); 
		return d;
	}
	
}
