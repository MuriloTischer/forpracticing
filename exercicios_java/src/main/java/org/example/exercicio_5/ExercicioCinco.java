package org.example.exercicio_5;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/22/2022
 * <p>
 * Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu. #5
 */
public class ExercicioCinco {
    public static void main(String[] args) {
        final int mes = 30;
        final int quantidadeDiasNoAno = 365;

        int idade;
        int quantidadeMes;
        int totalMes;
        int totalDiasVividos;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Informe também a quantidade de meses \n35que você ja completou antes do seu próximo aniversario: ");
        quantidadeMes = scanner.nextInt();

        totalMes = quantidadeMes * mes;
        totalDiasVividos = (idade * quantidadeDiasNoAno) + totalMes;


        System.out.print("Você ja viveu por aproximadamente: " + totalDiasVividos + " dias");
    }
}

