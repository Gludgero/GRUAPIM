import java.util.Deque;
import java.util.ArrayDeque;

public class Exercicio22 {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.push("Divina Comédia");
        livros.push("Hamlet");
        livros.push("Odisseia");
        
        System.out.println(livros.pop());
        System.out.println(livros.peek());
    }
}