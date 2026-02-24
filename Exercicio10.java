import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10{
	public static void main(String[] args) {
		ArrayList<String> cidades = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		cidades.add("São Paulo");
		cidades.add("Vitória da Conquista");
		cidades.add("João Pessoa");
		cidades.add("Salvador");
		cidades.add("Iconha");
		cidades.add("Maranhão");
		
		System.out.println("Digite o nome de uma cidade: ");
		String cidade = sc.nextLine();
		
		if(cidades.contains(cidade)) {
			System.out.println(cidades.indexOf(cidade));
		} else {
			System.out.println("A cidade não está presente");
		}
	
		sc.close();
	}
	
}