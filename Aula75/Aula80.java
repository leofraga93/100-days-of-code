package com.fraga.intermediario.Aula75;

public class Aula80 {
    public static void main(String[] args) {
        String teste = "Isso é um teste.";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15)); //o segundo parametro não é inclusivo

        String ola = "Olá";
        String mundo = " mundo!";
        System.out.println(ola + mundo);
        System.out.println(ola.concat(mundo));

        String olaMundo = ola.concat(mundo).replace(" ", ", ");
        System.out.println(olaMundo);

        String espaco = "i s pa ç o";
        String semEspaco = espaco.replace("i", "e");
        semEspaco = semEspaco.replaceAll(" ", "");
        System.out.println(semEspaco);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());
    }
}
