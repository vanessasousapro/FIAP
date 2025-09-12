package br.com.fiap.restaurant.model;

public class Bebida extends Produto{

    private int quantidade;

    public Bebida() { super();}

    public Bebida(String nome, String ingredientes, double preco, int quantidade) {
        super(nome, ingredientes, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() + "\nIngredientes: " + this.getIngredientes() + "\nPreço: R$" + this.getPreco() + "\nQuantidade: " + this.getQuantidade() + "ml";
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
