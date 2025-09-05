package org.vanessa.javaacademicexercise;

public class HabilidadeEspecial {
    String nome;
    int custoEnergia;
    boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilidade) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilidade;
    }

    public void ativarHabilidade() {
        habilitada = true;
    }
}
