package Exercicio07;

public class Veiculo{
	private String marca;
	private String modelo;

	
	public Veiculo(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
        return "Tipo: Veículo - Marca: " + getMarca() + ", Modelo: " + getModelo();
    }
}
