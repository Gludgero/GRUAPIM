package Exercicio26;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Historico historico = new Historico();
        int escolha = -1;
        while (escolha != 0) {
            System.out.println("Digite o Número da Ação Desejada:");
            System.out.println("Visitar URL (1)");
            System.out.println("Avançar (2)");
            System.out.println("Voltar (3)");
            System.out.println("Sair (4)");
            escolha = scanner.nextInt();
            scanner.nextLine();
                switch (escolha) {
                    case 1:    
                        System.out.println("\nQual site deseja visitar? Digite a URL: "); 
                    historico.visitar(scanner.nextLine());
                    break;

                    case 2:
                        String urlAvancada = historico.avancar();
                        if (urlAvancada != null) {
                            System.out.println("\nAvançando para: " + urlAvancada);
                        } else {
                            System.out.println("\nNão há mais páginas para avançar.");
                        }
                        break;
                    case 3:
                        String urlAnterior = historico.voltar();
                        if (urlAnterior != null) {
                            System.out.println("\nVoltando para: " + urlAnterior);
                        } else {
                            System.out.println("\nNão há mais páginas para voltar.");
                        }
                        break;   
                    case 4:
                        System.out.println("\nSaindo...");
                        escolha = 0;
                        break; 
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        }
}}
