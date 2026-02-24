import java.util.HashMap;
import java.util.Map;

public class Exercicio17 {
    public static void main(String[] args) {
        HashMap<String, Integer> contados = new HashMap<String, Integer>();
        
        String texto = 
        		  "Lívio, Euclides, Hipócrates ingente, "
        		+ "Ptolomeu, Galeno e o Avicena; "
        		+ "Averróis, nos comentos sapiente. "
        		+ "Resenha não me é dado fazer plena "
        		+ "De todos; longo o assunto está-me urgindo, "
        		+ "E a ser omisso muita vez condena. "
        		+ "A companhia então se dividindo, "
        		+ "Comigo o Mestre outra vereda trilha, "
        		+ "Do ar sereno ao ar, que treme, vindo: "
        		+ "Chegados somos onde luz não brilha.";
 
        String[] palavraArray = texto.split(" ");

        for (String palavra : palavraArray) {
		    Integer count = contados.get(palavra);
		    contados.put(palavra, count != null ? count + 1 : 1);
		}

        
        for (Map.Entry<String, Integer> entry : contados.entrySet()) {
            System.out.println("palavra: " + entry.getKey() + " teve " + entry.getValue() +  " ocorrências");
        }

    }
}