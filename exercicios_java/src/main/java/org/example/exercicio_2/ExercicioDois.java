package org.example.exercicio_2;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/6/2022
 * <p>
 * Crie um algoritmo que leia um número inteiro e mostre seu sucessor. #2
 */
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor para saber qual é o sucessor dele: ");
        int valor = scanner.nextInt();

        int sucessor = valor + 1;
        System.out.println("O sucessor do numero informado é: " + sucessor);


    }

}