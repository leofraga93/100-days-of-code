package com.fraga.intermediario.Aula71.Desafio;

public class ImpressoraThread{
    private int qntFolhas;
    private int tempo;

    public synchronized int ImpressoraThread(int qntFolhas, int tempo) {
        this.qntFolhas = qntFolhas;


        for (int i = 1; i <= qntFolhas; i++) {
                System.out.println("Folha: "+ i);

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return qntFolhas;
    }
}
