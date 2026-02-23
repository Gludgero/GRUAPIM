import java.util.Scanner;

public class Exercicio02{
	private static Scanner sc;

	
	public static void tabuada(int num) {
		for (int i = 1; i<11; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiroo");
		int n = sc.nextInt();
		
		tabuada(n);
	}
}