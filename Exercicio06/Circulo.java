package Exercicio06;
import java.lang.Math;


public class Circulo{
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio <= 0) {
			throw new IllegalArgumentException("O Raio deve ser positivo.");
		}
		this.raio = raio;
	}
	
	public double calcularArea() {
		double raio = getRaio();
		return (raio * raio) * Math.PI;
	}
	
	public Circulo(int raio) {
		setRaio(raio);
	}
	
	
	
}