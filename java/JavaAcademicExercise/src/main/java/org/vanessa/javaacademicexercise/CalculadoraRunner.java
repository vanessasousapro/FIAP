package org.vanessa.javaacademicexercise;

public class CalculadoraRunner {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        int soma = cal.somar(5, 3);

        System.out.println(soma);

        Doce brigadeiro = new Doce();
        brigadeiro.nome = "Brigadeiro De Chocolate Belga";
        brigadeiro.dizerNome();
    }
}
