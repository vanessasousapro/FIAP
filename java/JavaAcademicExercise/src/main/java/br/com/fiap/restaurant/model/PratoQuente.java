package br.com.fiap.restaurant.model;

public class PratoQuente extends Produto{

    private int serve;

    public PratoQuente() {
        super();
    }

    public PratoQuente(String nome, String ingredientes, double preco, int serve) {
        super(nome, ingredientes, preco);
        this.serve = serve;
    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() + "\nIngredientes: " + this.getIngredientes() + "\nPreço: " + this.getPreco() + "\nQuantidade: " + this.getServe();
    }

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }
}
