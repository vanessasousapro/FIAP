package org.vanessa.javaacademicexercise;

import java.util.HashSet;
import java.util.Set;

public class SetTEst {
    public static void main(String[] args) {
        //Criando o conjunto usando HashSet
        Set<String> frutas = new HashSet<>();

        //Adicionando Elementos ao Conjunto
        System.out.println("Adicionando 'Maça': " + frutas.add("Maça")); //Deve retornar true
        System.out.println("Adicionando 'Banana': " + frutas.add("Fruta")); //Deve retornar true
        System.out.println("Tentando adicionar 'Maça' Novamente: " + frutas.add("Maça")); // Deve retornar false

        //Verificando se o conjunto contém um elemento
        System.out.println("Conjunto contém 'Banana' " + frutas.contains("Banana")); //Deve retornar true
        System.out.println("Conjunto contém 'Laranja' " + frutas.contains("Laranja")); //Deve retornar false

        //Removendo um elemento do conjunto
        System.out.println("removendo 'Banana' " + frutas.remove("Banana")); //Deve retornar true
        System.out.println("Tentando remover 'Laranja' " + frutas.remove("Laranja")); //Deve retornar false

        //Verificando o tamanho do conjunto
        System.out.println("Número de elementos no conjunto: " + frutas.size());

        //Verificando se o conjunto está vazío
        System.out.println("Conjunto está vazio: " + frutas.isEmpty());

        //Percorrendo o set e exibindo o valor dos itens
        for (String item : frutas) {
            System.out.println(item);
        }

        //Limpando o conjunto
        frutas.clear();
        System.out.println("conjunto após limpar: " + frutas); //Deve ser []
        System.out.println("Conjunto está vazio: " + frutas.isEmpty()); // Deve retornar true
    }
}
