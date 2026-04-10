package com.fraga.intermediario.Aula71.Desafio;

public class App {
    public static void main(String[] args) {
        ImprimirDocumentosThread imprimirDocumentosThread0 = new ImprimirDocumentosThread("Extrato bancário docx", 10, 1000);
        ImprimirDocumentosThread imprimirDocumentosThread1 = new ImprimirDocumentosThread("Relatório financeiro", 4, 1000);
        ImprimirDocumentosThread imprimirDocumentosThread2 = new ImprimirDocumentosThread("Relatório de arrecadação", 1, 1000);


        Thread imp0 = new Thread(imprimirDocumentosThread0);
        Thread imp1 = new Thread(imprimirDocumentosThread1);
        Thread imp2 = new Thread(imprimirDocumentosThread2);

        try {
            imp0.join();
            if (imp0.isAlive()){
                System.out.println(imp0.getName());
            }

            imp1.join();
            if (imp1.isAlive()){
                System.out.println(imp1.getName());
            }

            imp2.join();
            if (imp2.isAlive()) {
                System.out.println(imp2.getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
