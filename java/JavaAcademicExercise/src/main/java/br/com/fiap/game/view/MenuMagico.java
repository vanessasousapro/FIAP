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
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar Energia \n5-Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = input.next() + input.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = input.next() + input.nextLine();
                    System.out.println("Digite o nível de energia do personagem: ");
                    int energia = input.nextInt();
                    personagemMagico.setNome(nome).setNivelEnergia(energia).setPoderMagico(poder);
                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = input.next() + input.nextLine();
                    System.out.println("Digite o custo para usar a habilidade especial: ");
                    int nivelEnergia = input.nextInt();
                    System.out.println("A habilidade está ativada? (true/false)");
                    boolean ativada = input.nextBoolean();

                    //Criando o objeto que reoresenta a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    //Atribuindo o objeto habilidade especial ao personagemMagico
                    personagemMagico.setHabilidadeEspecial(habilidadeEspecial);
                    break;
                case 2:
                    System.out.println("Nome: " + personagemMagico.getNome() + " Poder: " + personagemMagico.getPoderMagico() + " Nivel de energia: " + personagemMagico.getNivelEnergia());
                    HabilidadeEspecial h = personagemMagico.getHabilidadeEspecial();
                    if (h != null) {
                        System.out.println("Habilidade: " + h.getNome() + " | Custo de Energia: " + h.getCustoEnergia() + " | Habilidata: " + h.isHabilitada());
                    } else {
                        System.out.println("Habilidade: (Nenhuma Habilidade Cadastrada)");
                    }
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
                    HabilidadeEspecial he = personagemMagico.getHabilidadeEspecial();
                    if (he != null) {
                        he.ativarHabilidade();
                        System.out.println("A Habilidade está Ativada!");
                    } else {
                        System.out.println("Cadastre uma Habilidade Primeiro! (Opção 1)");
                    }
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
