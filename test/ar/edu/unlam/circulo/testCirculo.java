package ar.edu.unlam.circulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCirculo {
	Circulo miCirculo = new Circulo(8.0);

	@Test
	public void testPerimetroCirculo() {
		
		double valorEsperado= 50.2;
		
		assertEquals(valorEsperado, miCirculo.perimetro(), 0.1);
	}
	@Test
	public void testAreaCirculo() {
		
		double valorEsperado=201.06;
		
		assertEquals(valorEsperado,miCirculo.area(), 0.01);
		
		
		}
	

}
