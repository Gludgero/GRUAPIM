import java.util.LinkedHashSet;

public class Exercicio13{
	public static void main(String[] args) {
		LinkedHashSet<String> semana = new LinkedHashSet<>();

		semana.add("Quarta");
		semana.add("Terça");
		semana.add("Domingo");
		semana.add("Quinta");
		semana.add("Sábado");
		semana.add("Segunda");
		semana.add("Sexta");
		
		System.out.println("LinkedHashSet: " + semana);
		
	}
}