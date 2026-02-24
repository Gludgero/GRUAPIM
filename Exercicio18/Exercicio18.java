package Exercicio18;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro contato da agenda:");
        String nome = sc.nextLine();

        System.out.println("\nInsira o número para o contato "+ nome);
        String telefone = sc.nextLine();

        Agenda agenda = new Agenda(nome, telefone);

        System.out.println();

        int opcao = 0;
        
        do {
            System.out.println("Digite o número correspondente a ação:\n");
            System.out.println("Adicionar contato (1) ");
            System.out.println("Buscar Contato (2)");
            System.out.println("Listar Contatos (3)");
            System.out.println("Sair (4)");
            
            opcao =  sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nomeContato = sc.nextLine();
                    sc.nextLine();
                    System.out.println("\nDigite o número para o contato "+ nomeContato);
                    String numeroContato = sc.nextLine();
                    agenda.adicionaCont(nome, numeroContato);
                    System.out.println("\nContato adicionado!\n");
                break;

                case 2:
                    System.out.println("\nDigite o nome do contato que deseja consultar:");
                    
                    String busca = sc.nextLine();
                    String numeroBusca = agenda.buscarNumero(busca);
                    
                    if(numeroBusca == null){
                        System.out.println("\nContato não encontrado\n");
                    } else {
                        System.out.println("\nContato: " + busca + " - Número: " + numeroBusca + "\n");
                    }
                break;
                
                case 3:
                    System.out.println("\nExibindo contatos:\n");
                    agenda.showAgenda();
                break;
                
                case 4:
                    System.out.println("\n\n");
                break;
                default:
                    System.out.println("\nOpção inválida!\n");
                break;
            }
            
        } while (opcao != 4);

        sc.close();
    }

}
