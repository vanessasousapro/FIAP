package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class Main {
    public static void main(String[] args) {

        //Criando um objeto do tipo personagem mágico
        PersonagemMagico mago = new PersonagemMagico("Eldrin", 100, "Fogo");

        //Exibindo os valores dos atributos do objeto
        System.out.println("Personagem mágico: " + mago.nome + ", Nível de Energia: " + mago.nivelEnergia + ", Poder mágico: " + mago.poderMagico);

        //Criando um objeto do tipo personagem mágico
        PersonagemMagico fada = new PersonagemMagico("Sininho", 200, "Pó Mágico");

        //Exibindo os valores dos atributos do objeto
        System.out.println("Personagem mágico: " + fada.nome + ", Nível de Energia: " + fada.nivelEnergia + ", Poder mágico: " + fada.poderMagico);
    }
}
