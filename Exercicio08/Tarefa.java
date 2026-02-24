package	Exercicio08;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa {
    private static ArrayList<String> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void printMenu() {
    	System.out.println(">>Gerenciador de Tarefas<<\nDigíte o número correspondente à ação desejada:");
        System.out.println("- Adicionar tarefa (1)");
        System.out.println("- Remover tarefa (2)");
        System.out.println("- Listar tarefas (3)");
        System.out.println("- Sair (4)");
    }
    
    public static void adicionar() {
        System.out.println("\nQual tarefa você quer adicionar? ");
        String tarefa = scanner.nextLine();
        
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!\n");
    }

    public static void remover() {
        if (tarefas.isEmpty()) {
            System.out.println("\nLista de Tarefas Vazia.\n");
            return;
        }

        listar();
        System.out.print("Digite o índice da tarefa a remover: ");

        int indice = scanner.nextInt();

        if (indice >= 0 && indice < tarefas.size()) {
			tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!\n");
        } else {
            System.out.println("Índice inválido!\n");
        }
    }

    public static void listar() {

        if (tarefas.isEmpty()) {
            System.out.println("\nLista de Tarefas Vazia.\n");
        } else {
            System.out.println("SUAS TAREFAS");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }
            System.out.println();
        }
    }
   
}


