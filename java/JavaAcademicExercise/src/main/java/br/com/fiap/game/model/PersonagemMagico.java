package br.com.fiap.game.model;

public class PersonagemMagico {
    //Atributos
    private String nome;
    private int nivelEnergia;
    private String poderMagico;
    private HabilidadeEspecial habilidadeEspecial;

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
        if (nivelEnergia >= 10) {
            System.out.println(nome + "Realizou um ataque: " + ataque);
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + "Esta sem energia para atacar!");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += Math.max(0, energia);
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (habilidadeEspecial == null) {
            System.out.println("Nenhuma habilidade especial cadastrada.");
            return;
        }

        int custo = habilidadeEspecial.getCustoEnergia();
        if (nivelEnergia >= custo) {
            System.out.println("Ativando habilidade: " + habilidadeEspecial.getNome());
            nivelEnergia -= custo;
        }
    }

    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;

    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public PersonagemMagico setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
        return this;
    }
}
