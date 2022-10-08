package org.example.exercicio_1;

import java.util.Scanner;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 10/5/2022
 */
public class ImprimirNomeEmSequencia {
    public static void main(String[] args) {

        ExercicioUm meuNome = new ExercicioUm();
        String nome = meuNome.getNome();
        String segundoNome = meuNome.getSegundoNome();
        String sobrenomeMeio = meuNome.getSobrenomeMeio();
        String sobrenome = meuNome.getSobrenome();


        System.out.println("O meu primeiro nome é: " + nome);
        System.out.println("O meu segundo nome é: " + segundoNome);
        System.out.println("O meu sobrenome do meio é: " + sobrenomeMeio);
        System.out.println("O meu sobrenome é: " + sobrenome );


    }
}
