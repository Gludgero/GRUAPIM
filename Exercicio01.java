import java.util.Scanner;

public class Exercicio01{
	private static Scanner sc;

	public static float soma(float nota1, float nota2, float nota3) {
		return nota1 + nota2 + nota3;
	}
	
	public static String verificaStatus(float soma) {
		float media = soma / 3;
		if(media < 5) {
			return "Reprovado";
		}
		else if (media >= 7) {
			return "Aprovado";
		}
		else {
			return "Recuperação";
		}
	}
	
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Digite a Primeira nota:");
		float input1 = sc.nextFloat();
		System.out.println("Digite a Segunda nota:");
		float input2 = sc.nextFloat();
		System.out.println("Digite a Terceira nota:");
		float input3 = sc.nextFloat();
		
		System.out.println(verificaStatus(soma(input1, input2, input3)));
		
	}

}