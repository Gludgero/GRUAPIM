package Exercicio05;

public class Carro{
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	
	public String exibirInfo() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno();
	}
}