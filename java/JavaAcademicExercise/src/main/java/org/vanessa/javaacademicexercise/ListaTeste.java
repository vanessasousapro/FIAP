package org.vanessa.javaacademicexercise;

import java.util.ArrayList;
import java.util.List;

public class ListaTeste {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();

        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");

        System.out.println("Elemento na posição 2: " + cores.get(2));

        cores .set(3, "Roxo");
        System.out.println("Lista após modificar o elemento na posição 3: " + cores);

        cores.remove("Amarelo"); //Pelo Objeto
        cores.remove(0); //Pelo Índice
        System.out.println("Lista após remoções: " + cores);

        //Tamanho da Lista
        System.out.println("O tamanho da lista é: " + cores.size());

        //Verificar se um elemento está na lista
        if(cores.contains("Azul")) {
            System.out.println("A lista contém a cor Azul.");
        }

        //Percorre a lista e imprime a posição e o valor do elemento
        for (int i = 0; i < cores.size(); i++) {
            System.out.println("cor [" + i + "] = "+ cores.get(i));
        }

        //Limpa a lista
        cores.clear();
        System.out.println("Lista após limpar: " + cores);

        //Verifica se a lista está vazia
        if(cores.isEmpty()) {
            System.out.println("A lista está vazia.");
        }

        for (String cor : cores) {
            System.out.println("cor = " + cor);
        }
    }
}
