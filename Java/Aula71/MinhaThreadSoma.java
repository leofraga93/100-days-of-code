package com.fraga.intermediario.Aula71;

public class MinhaThreadSoma implements Runnable{
    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums){
        this.nome = nome;
        this.nums = nums;
//        Thread t = new Thread(this, nome);
//        t.start();
        //Forma simplificada de escrever as duas linhas de cima
        new Thread(this, nome).start();

    }

    @Override
    public void run() {

        System.out.println(this.nome +" iniciada");
        int soma = calc.somaArray(this.nums);
        System.out.println(this.nome +" finalizada");
        System.out.println("Resultado da soma pela thread "+ this.nums +" é "+ soma);

    }
}
