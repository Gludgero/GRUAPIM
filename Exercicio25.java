import java.util.Deque;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Deque<String> pilha = new java.util.LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        for(String palavra : palavras) {
            pilha.push(palavra);
        }

        for(int i = 0; i < palavras.length; i++) {
            System.out.print(pilha.pop() + " ");
        }
    }
}
