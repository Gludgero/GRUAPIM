package Exercicio15;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
	
	@Override
    public int compareTo(Produto prod) {
        return Double.compare(this.preco, prod.getPreco());
    }
	
}