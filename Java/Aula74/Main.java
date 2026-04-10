package com.fraga.intermediario.Aula74;

public class Main {
    public static void main(String[] args) {
        MinhaThread semaforo = new MinhaThread();

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }

        try {
            Thread.sleep(4000);
            semaforo.desligarSemaforo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
