package Exercicio23;

import java.util.List;
import java.util.Map;

public class Exercicio23 {
   public static void main(String[] args) {
        Map<String, List<Produto>> produtos = Map.of(
            "Eletrônicos", List.of(
                new Produto("Smartphone", 1500.00),
                new Produto("Notebook", 6000.00)
            ),
            "Eletrodomésticos", List.of(
                new Produto("Geladeira", 2000.00),
                new Produto("Fogão Cooktop", 650.00)
            ));

            produtos.get("Eletrônicos").forEach(p -> System.out.println(p.getNome() + ": R$ " + p.getPreco()));
   } 
}
