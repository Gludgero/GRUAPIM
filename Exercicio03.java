import java.util.Scanner;
import java.util.Random;

public class Exercicio03{
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Random random = new Random();
		
		int n = random.nextInt(1,100);
		
		System.out.println("Adivinhe o número!\nDigite um número entre 1 a 100!");
		int nUsu = sc.nextInt();
		while(nUsu != n) {
			if(nUsu > n) {
				System.out.println("Muito alto! Tente novamente:");
			}
			else {
				System.out.println("Muito baixo! Tente novamente:");
			}
			nUsu = sc.nextInt();
		}
		System.out.println("Acertou!");
	}
}