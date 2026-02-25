package Exercicio27;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Exercicio27 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(); 
        alunos.addAll(List.of(
            new Aluno("Diego", 8.5),
            new Aluno("Abner", 7.0),
            new Aluno("João", 9.0),
            new Aluno("Eduardo", 6.5),
            new Aluno("Giovanna", 10.0),
            new Aluno("Venielli", 5.0)
        ));

        Map<String, List<Aluno>> alunosPorNota = new HashMap<>();

        alunosPorNota.put("Aprovados", alunos.stream().filter(a -> a.getNota() >= 7.0).toList());
        alunosPorNota.put("Reprovados", alunos.stream().filter(a -> a.getNota() < 5.0).toList());
        alunosPorNota.put("Recuperação", alunos.stream().filter(a -> a.getNota() >= 5.0 && a.getNota() < 7.0).toList());

        
        for(Map.Entry<String, List<Aluno>> entry : alunosPorNota.entrySet()) {
            System.out.println(entry.getKey() + ":");
            entry.getValue().forEach(a -> System.out.println(" - " + a.getNome() + " (Nota: " + a.getNota() + ")"));
        }
    }
}
