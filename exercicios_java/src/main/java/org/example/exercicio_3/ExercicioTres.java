package org.example.exercicio_3;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/7/2022
 * Crie um algoritmo que leia um número inteiro e mostre seu antecessor. #3
 */
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para saber seu antecessor. ");
        int x = scanner.nextInt();

        int antecessor = x - 1;
        System.out.println("O antecessor do número "+x+" é o número " +antecessor);
    }
}
