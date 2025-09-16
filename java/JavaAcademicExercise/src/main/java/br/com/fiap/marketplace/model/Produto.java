package br.com.fiap.marketplace.model;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double valorDesconto) {
        return preco - valorDesconto;
    }

    public double calcularDesconto(String cupom) {
        if (cupom.equals("PROMOCAO10"))
            return  preco - (preco * 0.10);
        return preco;
    }

    public String getNome() {return nome;}
}
