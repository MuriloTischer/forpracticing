package org.example.exercicio_8;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 11/2/2022
 * <p>
 * Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
 * Considere que a cotação é US$ 1 = R$ 1,82. #8
 */
public class ExercicioOito {
    public static void main(String[] args) {

        final double cotacao = 1.82;
        double valorEmReal;
        double valorEmDolar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de DOLAR que você deseja converter: ");
        valorEmDolar = scanner.nextDouble();

        valorEmReal = valorEmDolar * cotacao;
        System.out.println("Você informou que quer converter $" + valorEmDolar + " dolares \n O valor atual do dolar é de R$1,82 \n" +
                "após a conversão você terá R$" + valorEmReal + " reais");
    }

}