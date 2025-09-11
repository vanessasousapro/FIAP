package br.com.fiap.game.model;

public class HabilidadeEspecial {
    public String nome;
    public int custoEnergia;
    public boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilidade) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilidade;
    }

    public void ativarHabilidade() {
        habilitada = true;
    }
}
