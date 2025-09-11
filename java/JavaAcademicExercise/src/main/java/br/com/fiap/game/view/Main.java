package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class Main {
    public static void main(String[] args) {

        //Criando um objeto do tipo personagem mágico
        PersonagemMagico mago = new PersonagemMagico("Eldrin", 100, "Fogo");

        //Exibindo os valores dos atributos do objeto
        System.out.println("Personagem mágico: " + mago.getNome() + ", Nível de Energia: " + mago.getNivelEnergia() + ", Poder mágico: " + mago.getPoderMagico());

        //Criando um objeto do tipo personagem mágico
        PersonagemMagico fada = new PersonagemMagico("Sininho", 200, "Pó Mágico");

        //Exibindo os valores dos atributos do objeto
        System.out.println("Personagem mágico: " + fada.getNome() + ", Nível de Energia: " + fada.getNivelEnergia() + ", Poder mágico: " + fada.getPoderMagico());
    }
}
