package ar.edu.unlam.circulo;

public class Circulo {
	private static final Double PI=Math.PI;
	private Double radio=0.0;
	
	public Circulo(Double radio) {
		this.radio=radio;
	}
	
	public Double perimetro() {
		return 2*this.PI*(this.radio);
	}
	public Double area() {
		return this.PI*(Math.pow(this.radio, 2));
 
	}
}
