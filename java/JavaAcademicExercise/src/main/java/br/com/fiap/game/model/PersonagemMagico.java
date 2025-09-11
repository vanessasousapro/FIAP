package br.com.fiap.game.model;

public class PersonagemMagico {
    //Atributos
    public String nome;
    public int nivelEnergia;
    public String poderMagico;
    public HabilidadeEspecial habilidadeEspecial;

    //Construtores
    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    public PersonagemMagico() {

    }
    //Métodos
    public void atacar(String ataque) {
        if(nivelEnergia >= 10) {
            System.out.println(nome + "Realizou um ataque: " + ataque);
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " Esta sem energia para atacar!");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidadeEspecial.habilitada) {
            System.out.println("Habilidade especial não está habilitada!");
        } else if (nivelEnergia >= habilidadeEspecial.custoEnergia){
            System.out.println("Ativando habilidade: " + habilidadeEspecial.nome);
            nivelEnergia -= habilidadeEspecial.custoEnergia;
        } else {
            System.out.println(nome + " Está sem energia para atacar!");
        }
    }
}
