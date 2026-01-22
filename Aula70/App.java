package com.fraga.intermediario.Aula70;

import com.fraga.intermediario.Aula69.MinhaThreadRunnable;

public class App {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("T1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("T2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("T3", 500);

        Thread T1 = new Thread(thread1);
        Thread T2 = new Thread(thread2);
        Thread T3 = new Thread(thread3);

        T1.setPriority(1);
        T2.setPriority(2);
        T3.setPriority(3);

        T1.start();
        T2.start();
        T3.start();
    }
}
