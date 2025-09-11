package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class MenuMagico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        PersonagemMagico personagemMagico = new PersonagemMagico();
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar Energia \n5- Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = input.next() + input.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = input.next() + input.nextLine();
                    System.out.println("Digite o nível de energia do personagem: ");
                    int energia = input.nextInt();
                    personagemMagico.nome = nome;
                    personagemMagico.nivelEnergia = energia;
                    personagemMagico.poderMagico = poder;

                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = input.next() + input.nextLine();
                    System.out.println("Digite o custo para usar a habilidade especial: ");
                    int nivelEnergia = input.nextInt();
                    System.out.println("A habilidade está ativada? (true/false)");
                    boolean ativada = input.nextBoolean();

                    //Criando o objeto que reoresenta a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    //Atribuindo o objeto habilidade especial ao personagemMagico
                    personagemMagico.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagemMagico.nome + " Poder: " + personagemMagico.poderMagico + " Nivel de energia: " + personagemMagico.nivelEnergia);
                    System.out.println(" Habilidade: " + personagemMagico.habilidadeEspecial.nome + " Custo de energia: " + personagemMagico.habilidadeEspecial.custoEnergia + " Habilitada? " + personagemMagico.habilidadeEspecial.habilitada);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = input.next() + input.nextLine();
                    personagemMagico.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int qtd = input.nextInt();
                    int nivelAtual = personagemMagico.aumentarEnergia(qtd);
                    System.out.println("Nível atual de energia: " + nivelAtual);
                    break;
                case 5:
                    personagemMagico.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagemMagico.habilidadeEspecial.ativarHabilidade();
                    System.out.println("A Habilidade está Habilitada!");
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
