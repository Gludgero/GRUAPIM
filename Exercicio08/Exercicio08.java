package Exercicio08;
import java.util.Scanner;
public class Exercicio08{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean executando = true;
		while (executando) {
		    Tarefa.printMenu();
		    int opcao = sc.nextInt();
		
		    switch (opcao) {
		        case 1:
		        	Tarefa.adicionar();
		            break;
		        case 2:
		            Tarefa.remover();
		            break;
		        case 3:
		        	Tarefa.listar();
		            break;
		        case 4:
		            System.out.println("\nPrograma finalizado!");
		    executando = false;
		    break;
		default:
		    System.out.println("\nOpção inválida! Tente novamente.\n");
		        }
		    }
	sc.close();
	}
}
