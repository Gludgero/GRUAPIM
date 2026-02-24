
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("Maçã", "Apple");
        dic.put("Porco", "Pig");
        dic.put("Tempestade", "Storm");
        dic.put("Fogo", "Fire");
        String txt;
        do {
            System.out.println("Digite abaixo uma palavra para traduzir : ");

            txt = sc.nextLine();

            if (!dic.containsKey(txt)) {
                System.out.println("Palavra não encontrada. Tente novamente.");
            }

        } while (!dic.containsKey(txt));

        System.out.println("'" + txt + "' se traduz para: "  + dic.get(txt));

        sc.close();
    }
}