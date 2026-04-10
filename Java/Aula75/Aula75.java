package com.fraga.intermediario.Aula75;

public class Aula75 {
    public static void main(String[] args) {
        String texto;

        texto = new String();
        System.out.println(texto);

        texto = new String("JAVA");
        System.out.println(texto);

        String variavel = new String(texto);
        System.out.println(variavel);

        char[] charsJava = {'J', 'A', 'V', 'A'};
        texto = new String(charsJava, 0, 2);
        System.out.println(texto);

        texto = "JAVA";
        System.out.println(texto);

        String texto2 = "JAVA";
        System.out.println(texto);

    }
}
