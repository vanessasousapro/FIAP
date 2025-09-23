package br.com.fiap.vectors.view;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {64, 34, 25, 12, 22, 11, 90};

        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    houveTroca = true;
                }
            }
        }while (houveTroca);

        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
