package Exercicio15;
import java.util.TreeSet;

public class Exercicio15{
	public static void main(String[] args) {
		
		TreeSet<Produto> arr = new TreeSet<>();
		
		arr.add(new Produto("Chocolate", 8.00));
		arr.add(new Produto("Banana", 20.00));
		arr.add(new Produto("Pernil", 90.00));
		arr.add(new Produto("Batata", 22.00));
		
		System.out.println("Produtos ordenados por preço:");
		for (Produto produto : arr) {
			System.out.println(produto.getNome() + " " + produto.getPreco());
		}
	}
}