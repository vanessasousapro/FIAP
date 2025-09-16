package br.com.fiap.marketplace.view;

import br.com.fiap.marketplace.model.Produto;

import java.util.Scanner;

public class ViewProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = input.next() + input.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = input.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println("Escolha um tipo de desconto: \n1-Valor em reais \n2-Cupom de desconto");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do desconto");
                double desconto = input.nextDouble();
                System.out.println("Valor com desconto: " + produto.calcularDesconto(desconto));
                break;
            case 2:
                System.out.println("Digite o cupom de desconto: ");
                String cupom = input.next() + input.nextLine();
                System.out.println("Valor com desconto: " + produto.calcularDesconto(cupom));
            default:
                System.out.println();
                break;
        }
    }
}
