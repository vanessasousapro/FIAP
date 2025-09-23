package br.com.fiap.vectors.view;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetorOrdenado = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int elementoProcurado = 88;
        int inicio = 0;
        int fim = vetorOrdenado.length - 1;
        int posicaoEncontrrada = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetorOrdenado[meio] == elementoProcurado) {
                posicaoEncontrrada = meio;
                break;
            }else if (vetorOrdenado[meio] < elementoProcurado) {
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }
        }

        if (posicaoEncontrrada != -1) {
            System.out.println("Elemento encontrado na posição: " + posicaoEncontrrada);
        }else {
            System.out.println("Elemento não encontrado no vetor.");
        }
    }
}
