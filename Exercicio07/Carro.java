package Exercicio07;
public class Carro extends Veiculo{
	private int numeroDePortas;
	
	public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.setNumeroDePortas(numeroDePortas);
    }
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public String toString(){
        return "Tipo: Carro - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Número de Portas: " + getNumeroDePortas();
	}
}