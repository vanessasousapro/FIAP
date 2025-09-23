package org.vanessa.javaacademicexercise;

public class Matrizes {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];

        int[][] matrizDireta = {{1, 2}, {3, 4}, {5, 6}};

        int elemento = matrizDireta[0][1];

        matrizDireta[0][1] = 10;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
