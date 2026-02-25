import java.util.TreeMap;

public class Exercicio20 {
	public static void main(String[] args) {
		TreeMap<String, Double> notas = new TreeMap<>();
		notas.put("Diego", 8.3);
		notas.put("Abner", 4.1);
		notas.put("João", 7.0);
		notas.put("Erick", 10.0);
		notas.put("Giovanna", 8.8);
		
		
		for (String nome : notas.keySet()) {
			System.out.println("Nome: " + nome + ", Nota: " + notas.get(nome));
		}	
	}
}
