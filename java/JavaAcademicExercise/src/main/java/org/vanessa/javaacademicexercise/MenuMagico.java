package org.vanessa.javaacademicexercise;

import java.util.Scanner;

public class MenuMagico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int opcao;
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
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.poderMagico = poder;

                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = input.next() + input.nextLine();
                    System.out.println("Digite o custo para usar a habilidade especial: ");
                    int nivelEnergia = input.nextInt();
                    System.out.println("A habilidade está ativada? (true/false)");
                    boolean ativada = input.nextBoolean();

                    //Criando o objeto que reoresenta a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Nivel de energia: " + personagem.nivelEnergia);
                    System.out.println(" Habilidade: " + personagem.habilidadeEspecial.nome + " Custo de energia: " + personagem.habilidadeEspecial.custoEnergia + " Habilitada? " + personagem.habilidadeEspecial.habilitada);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = input.next() + input.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int qtd = input.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nível atual de energia: " + nivelAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
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
