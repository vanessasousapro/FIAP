package br.com.fiap.vectors.view;

public class Vetores {
    public static void main(String[] args) {
        //int[] meuVetor = new int[10];

        int[] meuVetor = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //Acessando Elemento Do Vetor Pelo Índice
        int elemento = meuVetor[2];
        System.out.println(elemento);

        //Modificando o Valor Do Elemento
        meuVetor[1] = 90;

        //Quantidade De Posições
        System.out.println(meuVetor.length);

        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i]);
        }
    }
}
