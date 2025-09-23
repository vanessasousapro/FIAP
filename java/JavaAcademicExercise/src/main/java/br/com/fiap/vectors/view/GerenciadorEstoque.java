package br.com.fiap.vectors.view;

//Consideramos um cenário de uma pequena loja que precisa gerenciar seu estoque de produtos
//Para cada produto, a loja quer manter um registro do nome do produto e verificar rapidamente se o produto está em estoque!

import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {

        String[] produtosEstoque = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < produtosEstoque.length; i++) {
            System.out.println("Digite o nome do produto: " + (i + 1));
            produtosEstoque[i] = input.next() + input.nextLine();
        }

        System.out.println("Digite o nome do produto procurado:");
        String produtoProcurado = input.next() + input.nextLine();

        for (int i = 0; i < produtosEstoque.length; i++) {
            System.out.println(produtosEstoque[i]);
        }

        boolean produtoEncontrado = false;
        int i = 0;
        while (!produtoEncontrado && i < produtosEstoque.length) {
            if (produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        if (produtoEncontrado) {
            System.out.println(produtoProcurado + " Está disponível no estoque!");
        } else {
            System.out.println(produtoProcurado + " Não foi encontrado no estoque!");
        }
        input.close();
    }
}
