package org.vanessa.javaacademicexercise;

import java.util.Scanner;

public class MenuLojinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProdutoLojinha produto = new ProdutoLojinha();
        int opcao;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Produto \n2-Exibir Produto \n3-Comprar Produto \n4-Adicionar Produto ao Estoque \n5-Aplicar Desconto \n0-Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    input.nextLine();
                    String nome = input.nextLine();

                    System.out.println("Digite o preço do produto:");
                    double preco = input.nextDouble();

                    System.out.println("Digite  a quantidade em estoque do produto:");
                    int quantidade = input.nextInt();

                    produto = new ProdutoLojinha(nome, preco, quantidade);
                    break;
                case 2:
                    produto.exibirInformacoes();
                    break;
                case 3:
                    System.out.println("Digite a quantidade para comprar: ");
                    int qtd = input.nextInt();
                    produto.comprar(qtd);
                    break;
                case 4:
                    System.out.println("Digite a quantidade que deseja adicionar ao estoque: ");
                    qtd = input.nextInt();
                    produto.adicionarEstoque(qtd);
                    break;
                case 5:
                    System.out.println("Digite a porcentagem de desconto: ");
                    double desconto = input.nextDouble();
                    produto.aplicarDesconto(desconto);
                    break;
                case 0:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 0);
        input.close();
    }
}
