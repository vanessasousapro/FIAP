package br.com.fiap.usbSystem.view;

//Na empresa da senhora Undina Souza Barbosa, a UBS Systems, todos os funcionários são cadastrados pelo nome, cpf e endereço.
//Todos também recebem um salário fixo e um bônus semestral, mas as coisas começam a ficar diferentes quando comparamos os Vendedores, os programadores e os Gerentes.

//- Os gerentes possuem uma sala, onde podem ser encontrados, que possui um número e um ramal telefônico. Os bônus dos gerentes são correspondentes a 5% do faturamento semestral que tiveram.

//- Para os vendedores, não existem salas e nem ramais. Seus bônus são correspondentes a 1,5% das vendas que realizaram no semestre.

//- Para os programadores, existem apenas os ramais em que podem ser contatados. Seus bônus são sempre de 2% sobre po salário fixo.

//É importante, também obter um detalhamento em formato de texto com todos os dados de cada funcionário.

import br.com.fiap.usbSystem.model.Endereco;
import br.com.fiap.usbSystem.model.Gerente;

import java.util.Scanner;

public class ViewGerente {
    private static void exibirMenu() {
        System.out.println("Você deve selecioner uma operação");
        System.out.println("1-Cadastrar/Alterar Gerente");
        System.out.println("2-Exibir Gerente");
        System.out.println("3-Sair");
        System.out.println("Digite o número da opção");
    }

    private static Gerente cadastrarGerente() {
        Gerente gerente = new Gerente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do gerente: ");
        gerente.setNome(sc.nextLine());
        System.out.println("Informe o nome da rua, " + "o número, " + "o complemento: " + "o CPF: " + "a cidade eo estado: " + "teclando entrer ao final de cada um: ");
        gerente.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o CPF do gerente: ");
        gerente.setCpf(sc.nextLine());
        System.out.println("Informe o salario fixo do gerente: ");
        gerente.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o número da sala do gerente: ");
        gerente.setSala(sc.nextInt());
        System.out.println("Informe o ramal do gerente: ");
        gerente.setRamal(sc.nextInt());
        System.out.println("Informe o faturamento semestral do gerente: ");
        gerente.setFaturamentoSemestral(sc.nextDouble());
        return gerente;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = null;
        int opcao;
        do {
            exibirMenu();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    gerente = cadastrarGerente();
                    break;
                case 2:
                    if (gerente != null) {
                        System.out.println(gerente.getDetalhamento());
                    } else {
                        System.out.println("Nenhum gerente cadastrado!");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 3);
        sc.close();
    }
}
