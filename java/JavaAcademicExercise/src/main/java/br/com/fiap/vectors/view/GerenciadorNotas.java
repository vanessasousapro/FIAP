//Imagine um sistema para gerenciar as notas dos alunos em uma turma
//Este sistema deve permitir o armazenamento das notas de um aluno
//Calcular a média das notas do aluno e determinar se o aluno está aprovado ou reprovado com base em sua média
package br.com.fiap.vectors.view;

import java.util.Scanner;

public class GerenciadorNotas {
    public static void main(String[] args) {
        double[] notasAluno = new double[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notasAluno.length; i++) {
            System.out.println("Digite a nota do aluno: " + (i + 1));
            notasAluno[i] = input.nextDouble();
        }

        double somaNotas = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            somaNotas += notasAluno[i];
        }
        double media = somaNotas / notasAluno.length;

        System.out.println("Média do aluno: " + media);
        if (media >= 7.0) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        input.close();
    }
}
