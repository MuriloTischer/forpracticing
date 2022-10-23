package org.example.Exercicio_6;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/23/2022
 * <p>
 * Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles. #6
 */
public class ExercicioSeis {
    public static void main(String[] args) {

        int numeroX;
        int numeroY;
        int restoDaDivisao;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        numeroX = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        numeroY = scanner.nextInt();

        restoDaDivisao = numeroX % numeroY;
        System.out.println("O resto da divisão do primeiro valor informado pelo segundo é: " +restoDaDivisao);

    }

}

