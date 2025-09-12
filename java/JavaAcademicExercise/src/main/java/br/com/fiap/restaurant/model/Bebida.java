package br.com.fiap.restaurant.model;

public class Bebida extends Produto{

    private int quantidade;

    public Bebida() { super();}

    public Bebida(String nome, String ingredientes, double preco, int quantidade) {
        super(nome, ingredientes, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
