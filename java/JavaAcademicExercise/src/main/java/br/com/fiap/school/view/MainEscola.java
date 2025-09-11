package br.com.fiap.school.view;

//Desenvolva uma classe para representar um aluno em uma faculdade.
//Este aluno terá um registro de matrícula, nome e endereço.
//O endereço incluirá o logradouro, número, CEP e uma referência à cidade, a qual será representada por uma Classe contendo nome e estado.

import br.com.fiap.school.model.Aluno;
import br.com.fiap.school.model.Cidade;
import br.com.fiap.school.model.Endereco;

import java.util.Scanner;

public class MainEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Aluno aluno = new Aluno();

        do {
            System.out.println("Escolha: \n1-Cadastrar Aluno \n2-Exibir Aluno \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Qual o RM?");
                    int rm = sc.nextInt();
                    System.out.println("Digite o logradouro do aluno: ");
                    String logradouro = sc.next() + sc.nextLine();
                    System.out.println("Digite o numero: ");
                    int numero = sc.nextInt() + sc.nextInt();
                    System.out.println("Digite o CEP: ");
                    String cep = sc.next() + sc.nextLine();
                    System.out.println("Digite o nome da cidade: ");
                    String nomeCidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o estado: ");
                    String estado = sc.next() + sc.nextLine();
                    Cidade cidade = new Cidade(nomeCidade, estado);
                    Endereco endereco = new Endereco(logradouro, numero, cep, cidade);
                    aluno.setNome(nome);
                    aluno.setRm(rm);
                    aluno.setEndereco(endereco);
                    System.out.println("Aluno Cadastrado com Sucesso!");
                    break;
                case 2:
                    System.out.println("NOME: " + aluno.getNome() + " RM: " + aluno.getRm());
                    System.out.println("ENDEREÇO: " + aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero() + ", CEP: " + aluno.getEndereco().getCep());
                    System.out.println(aluno.getEndereco().getCidade().getNome() + "/" + aluno.getEndereco().getCidade().getEstado());
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        } while (op != 0);
        sc.close();
    }
}
