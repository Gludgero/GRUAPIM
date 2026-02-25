import java.util.LinkedHashMap;
public class Exercicio19 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> cadastros = new LinkedHashMap<>();
		
		cadastros.put(4, "Diego");
		cadastros.put(2, "Abner");
		cadastros.put(7, "João");
		cadastros.put(1, "Erick");
		cadastros.put(5, "Giovanna");
		cadastros.put(9, "Venielli");
		cadastros.put(7, "Beatriz");
	
		for (Integer id : cadastros.keySet()) {
			System.out.println("ID: " + id + ", Nome: " + cadastros.get(id));
		}
		
	}
}
