package br.com.fiap.cine;

//O sistema apresentará inicialmente a disposição atual dos assentos do cinema, indicando quais estão ocupados e quais estão disponíveis.
//Em seguida solicitará que o usuário fornece a fila e o número do assento desejado para fazer a reserva.
//Caso o assento selecionado esteja livre, ele será efetivamente reservado para o usuário.
//Se o assento já estiver ocupado ou a seleção for inválida à escolha de uma fila ou número de assento fora dos limites permitidos, o sistema notificará o usuário com uma mensagem específica indicando que o assento está ocupado.

import java.util.Scanner;

public class EscolhaPoltronaCinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] salaCinema = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0}
        };

        System.out.println("Situação atual dos assentos (L = Livre, O = Ocupado):");

        for (int i = 0; i < salaCinema.length; i++) {
            for (int j = 0; j < salaCinema[i].length; j++) {
                System.out.print(salaCinema[i][j] == 0 ? "L " : "O ");
            }
            System.out.println(" <- Fileira " + (i + 1));
        }

        System.out.println("Escolha a fileira:");
        int fileiraEscolhida = input.nextInt() - 1;

        System.out.println("Escolha o número do assento: ");
        int assentoEscolhido = input.nextInt() - 1;

        if (fileiraEscolhida >= 0 && fileiraEscolhida < salaCinema.length && assentoEscolhido >= 0  && assentoEscolhido < salaCinema[fileiraEscolhida].length) {
            if (salaCinema[fileiraEscolhida][assentoEscolhido] == 0) {
                salaCinema[fileiraEscolhida][assentoEscolhido] = 1;
                System.out.println("Assento reservado com sucesso!");
            }else {
                System.out.println("O assento já está ocupado, por favor selecione outro.");
            }
        }else {
            System.out.println("Escolha inválida, tente novamente.");
        }
        input.close();
    }
}
