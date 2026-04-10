package com.fraga.intermediario.Aula75;

import java.io.PrintStream;

public class Aula79 {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf("a"));
        System.out.println(banana.lastIndexOf("n"));
        System.out.println(banana.contains(ana));

        System.out.println("--------------- Testando meu conhecimento ---------------");

        for (int i = 0; i < banana.length(); i++){
            Character letra = banana.charAt(i);

            System.out.println(banana.indexOf(letra));
        }

        System.out.println("--------------- Testando meu método passando a variavel ---------------");

        passaLetra(ana);

        passaLetra(banana);
    }

    public static void passaLetra(String variavel){
        for (int i = 0; i < variavel.length(); i++) {
            Character letra = variavel.charAt(i);

            System.out.println(variavel.indexOf(letra));
        }
    }
}
