import java.util.ArrayList;
import java.util.Random;
public class Exercicio24 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Diego");
        lista.add("Abner");
        lista.add("João");
        lista.add("Diego");
        lista.add("Eduardo");
        lista.add("Giovanna");
        lista.add("Venielli");
        lista.add("Diego");
        lista.add("Júlia");
        lista.add("Erick");
        lista.add("Christopher");
        lista.add("Gustavo");
        lista.add("Gislane");

        lista = new ArrayList<>(new java.util.LinkedHashSet<>(lista));

        Random random = new Random();
        int sorteio = random.nextInt(lista.size());
        String nomeSorteado = lista.get(sorteio);
        System.out.println("Nome sorteado: " + nomeSorteado);
        
        for(int i = 0; i < 3; i++) {
            sorteio = random.nextInt(lista.size());
            System.out.println("Nome sorteado " + (i+1) + ": " + lista.get(sorteio));
        }
        
    }
}
