package com.fraga.intermediario.Aula71;

public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8};

        MinhaThreadSoma minhaThreadSoma1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma minhaThreadSoma2 = new MinhaThreadSoma("#2", array);


    }
}
