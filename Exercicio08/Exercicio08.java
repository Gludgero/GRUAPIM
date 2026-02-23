package	Exercicio08;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08 {
    private static ArrayList<String> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        System.out.println("=== GERENCIADOR DE TAREFAS ===\n");

        while (executando) {
            exibirMenu();
            int opcao = obterOpcao();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    System.out.println("\nPrograma finalizado!");
                    executando = false;
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Remover tarefa");
        System.out.println("3. Listar tarefas");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int obterOpcao() {
        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            return opcao;
        } catch (Exception e) {
            scanner.nextLine(); // Limpar o buffer em caso de erro
            return -1;
        }
    }

    private static void adicionarTarefa() {
        System.out.print("\nDigite a tarefa a adicionar: ");
        String tarefa = scanner.nextLine();

        if (tarefa.isEmpty()) {
            System.out.println("Tarefa não pode ser vazia!\n");
        } else {
            tarefas.add(tarefa);
            System.out.println("Tarefa adicionada com sucesso!\n");
        }
    }

    private static void removerTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas para remover!\n");
            return;
        }

        listarTarefas();
        System.out.print("Digite o índice da tarefa a remover: ");

        try {
            int indice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (indice >= 0 && indice < tarefas.size()) {
                String tarefaRemovida = tarefas.remove(indice);
                System.out.println("Tarefa '" + tarefaRemovida + "' removida com sucesso!\n");
            } else {
                System.out.println("Índice inválido!\n");
            }
        } catch (Exception e) {
            scanner.nextLine(); // Limpar o buffer em caso de erro
            System.out.println("Entrada inválida!\n");
        }
    }

    private static void listarTarefas() {
        System.out.println();

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.\n");
        } else {
            System.out.println("=== SUAS TAREFAS ===");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }
            System.out.println();
        }
    }
}


