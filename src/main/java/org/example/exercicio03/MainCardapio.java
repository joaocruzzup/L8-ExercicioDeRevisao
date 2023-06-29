package org.example.exercicio03;


import java.util.Scanner;

public class MainCardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PratoOperacoes pratoOperacoes = new PratoGerenciamento();
        PratoServico pratoServico = new PratoServico(pratoOperacoes);


        int opcao = 5;

        while (opcao != 0) {
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    limparConsole();
                    pratoServico.exibirPrato();
                    exibirPausa();
                    limparConsole();
                    break;
                case 2:
                    limparConsole();
                    pratoServico.adicionarPrato();
                    exibirPausa();
                    limparConsole();
                    break;
                case 3:
                    limparConsole();
                    pratoServico.removerPrato();
                    exibirPausa();
                    limparConsole();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }

    public static void exibirMenu(){
        System.out.println("-------- Boas vindas ao gerenciador de Cardápios --------");
        System.out.println("1 - Visualizar lista de pratos");
        System.out.println("2 - Adicionar prato");
        System.out.println("3 - Remover prato");
        System.out.println("0 - Sair do programa");
        System.out.println("Digite a opção que deseja");
        System.out.print("Digite aqui: ");
    }

    public static void exibirPausa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite *ENTER* para retornar ao Menu Principal");
        entrada.nextLine();
    }

    public static void limparConsole(){
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
