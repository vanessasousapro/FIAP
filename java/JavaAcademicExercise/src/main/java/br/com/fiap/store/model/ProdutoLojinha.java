package br.com.fiap.store.model;

//Crie uma classe chamada Produto que represente um produto em uma loja.
//O produto deve ter os seguintes atributos:
// - String nome (O nome do produto)
// - double preco (O preço do produto)
// - int quantidade (a quantidade em estoque do produto)
//
//A classe deve incluir os seguintes métodos:
// - Um metodo exibirInformacoes()
//      Que exiba na tela todas as informações do produto, incluindo nome,
//      preco e quantidade em estoque.
//
// - um metodo comprar(int quantidadeComprada)
//      Que recebe a quantidade a ser comprada como argumento e atualiza a quantidade
//      em estoque. Certifique-se de que a quantidade em estoque não seja negativa apos a compra.
//
// - Um metodo adicionarEstoque(int quantidadeAdicional)
//      Que recebe a quantidade a ser adicionada ao estoque como argumento e
//      atualiza a quantidade em estoque.
//
// - Um metodo adicionarDesconto(double percentual)
//      Que recebe a porcentagem de desconto a ser aplicada ao preco do produto.

public class ProdutoLojinha {
    //Atributos
    String nome;
    double preco;
    int estoque;

    //Construtores
    public ProdutoLojinha(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public ProdutoLojinha() {

    }

    //Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada <= estoque) {
            estoque -= quantidadeComprada;
            System.out.println("Compra realizada com sucesso! Quantidade em estoque: " + estoque);
        } else {
            System.out.println("Erro ao comprar, quantidade insuficiente em estoque!");
        }
    }

    public void adicionarEstoque(int quantidadeAdicional) {
        estoque += quantidadeAdicional;
        System.out.println("Quantidade adicionada ao estoque. Novo total do estoque: " + estoque);
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
        System.out.println("Desconto aplicado! Novo preço do produto: R$" + preco);
    }
}

