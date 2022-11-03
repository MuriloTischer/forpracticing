package org.example.exercicio_7;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 11/2/2022
 * <p>
 * Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado. #7
 */

public class ExercicioSete {
    public static void main(String[] args) {
        double salarioFuncionario;
        double percentualDoReajuste = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu salário atual: ");
        salarioFuncionario = scanner.nextDouble();

        double salarioComReajuste = salarioFuncionario * (percentualDoReajuste / 100);
        double novoSalario = salarioFuncionario + salarioComReajuste;
        System.out.println(nome + " seu salario atual de R$" + salarioFuncionario + " teve um reajuste de 7% \n" +
                "você agora passará a receber R$" + novoSalario);

        System.out.println();
        System.out.println(novoSalario);
    }


}
