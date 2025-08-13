package org.vanessa.javaacademicexercise;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo e maior que 1: ");
        int number = scanner.nextInt();

        if (number <= 1 ) {
            System.out.println("Número invalido. Digite um número inteiro positivo e maior que 1.");
        }else {
            boolean isPrime = true;

            for(int i = 2; i < number; i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("O número " + number + " é um número primo!");
            }else {
                System.out.println("O número" + number + " não é um número primo!");
            }
        }
        scanner.close();
    }
}
