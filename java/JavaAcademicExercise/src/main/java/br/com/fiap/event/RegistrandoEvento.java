package br.com.fiap.event;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistrandoEvento {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar Participante");
            System.out.println("2. Verificar se um participante está registrado");
            System.out.println("3. Remover Participante");
            System.out.println("4. Listar Participantes");
            System.out.println("0. Sair");
            System.out.println("Escolha uma Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            String nome;

            switch (opcao) {
                case 1: //Adicionar participante
                    System.out.println("Digite o nome do participante a ser adicionado: ");
                    nome = input.nextLine();
                    if (participantes.add(nome)) {
                        System.out.println(nome + "Adicionado com sucesso!");
                    } else {
                        System.out.println(nome + "Já está registrado no evento!");
                    }
                    break;
                case 2: //Verificar Participante
                    System.out.println("Digite o nome do participante a ser verificado: ");
                    nome = input.nextLine();
                    if (participantes.contains(nome)) {
                        System.out.println(nome + " Está registrado no evento!");
                    } else {
                        System.out.println(nome + "Não está registrado no evento!");
                    }
                    break;
                case 3: //Remover participante
                    System.out.println("Digite o nome do participante a ser removido: ");
                    nome = input.nextLine();
                    if (participantes.remove(nome)) {
                        System.out.println(nome + "Removado com sucesso!");
                    } else {
                        System.out.println(nome + "Não foi encontrado no registro do evento.");
                    }
                    break;
                case 4: //Listar participantes
                    System.out.println("Participante Registrado");
                    if (participantes.isEmpty()) {
                        System.out.println("Nenhum participante registrado");
                    }else {
                        for (String participante : participantes) {
                            System.out.println(", " + participantes);
                        }
                    }
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        } while (opcao != 0);
    }
}
