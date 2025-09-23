package br.com.fiap.vectors.view;

import java.util.Scanner;

public class ExercicioVetorEntrada {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        System.out.println("Valores do vetor: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posição ["+ i +"] do vetor");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("["+ i +"] = " + vetor[i]);
        }
    }
}
