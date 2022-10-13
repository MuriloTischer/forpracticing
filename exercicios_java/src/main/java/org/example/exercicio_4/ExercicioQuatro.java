package org.example.exercicio_4;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/12/2022
 *
 * Crie um algoritmo que lê dois números inteiros, X e Y,
 * e mostre o resultado da multiplicação de x por y. #4
 */
public class ExercicioQuatro {
    public static void main(String[] args) {

    int x;
    int y;

        System.out.println("PARA SABERMOS A MULTIPLICAÇÃO ENTRE DOIS NUMEROS INTEIROS, SIGA OS PASSOS A SEGUIR. ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        x = scanner.nextInt();
        System.out.println("o primeiro numero informado foi: " +x);
        System.out.print("Digite o numero que deseja multiplicar pelo anterior: ");
        y = scanner.nextInt();
        System.out.println("o segundo numero informado foi: " +y);

        int valorResultado = x * y;

        System.out.println("O valor de "+x+ " X "+y+" é: " +valorResultado );

    }

}


