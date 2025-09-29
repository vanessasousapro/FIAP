package br.com.fiap.cine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VotacaoFilme {
    public static void main(String[] args) {
        //Lista de filmes disponíveis para votação
        List<String> filmes = Arrays.asList("O Poderoso Chefão", "A Origem", "Clube Da Luta", "Forrest Gump");

        //Lista para armazenar os votos de cada filme. Inicializa todos os contadores de votos com zero
        ArrayList<Integer> votos = new ArrayList<>(Arrays.asList(0, 0, 0, 0));

        Scanner input = new Scanner(System.in);

        //Exibindo a lista de filmes para votação
        System.out.println("Vote no seu filme favorito para a noite do cinema:");
        for ( int i = 0; i < filmes.size(); i++ ) {
            System.out.println((i + 1) + ". " + filmes.get(i));
        }

        //PErmitindo que os usuários votem
        System.out.println("\nDigite o número do seu filme preferido (ou zero para encerrar a votação):");
        int voto;
        do {
            voto = input.nextInt();
            if (voto > 0 && voto <= filmes.size()) {
                int indice = voto -1;
                votos.set(indice, votos.get(indice) + 1);
            }else if (voto != 0){
                System.out.println("Opção Inválida, Tente Novamente!");
            }
        }while (voto != 0);

        //Contando Votos e Determinando o filme vencedor
        int maxVotos = 0;
        int indiceVencedor = -1;
        for ( int i = 0; i < votos.size(); i++ ) {
            if (votos.get(i) > maxVotos) {
                maxVotos = votos.get(i);
                indiceVencedor = i;
            }
        }

        //Anunciando o filme vencedor
        if (indiceVencedor != -1) {
            System.out.println("O filme escolhido para a noite do cinema é: " + filmes.get(indiceVencedor));
        }else{
            System.out.println("\nNenhum filme recebeu votos!");
        }
    }
}
