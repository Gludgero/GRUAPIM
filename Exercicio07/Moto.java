package Exercicio07;
public class Moto extends Veiculo{
	private int cilindradas;
	
	public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.setCilindradas(cilindradas);
    }
	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int numeroDePortas) {
		this.cilindradas = numeroDePortas;
	}
	
	@Override
	public String toString(){
        return "Tipo: Moto - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Cilindradas: " + getCilindradas();
	}
}