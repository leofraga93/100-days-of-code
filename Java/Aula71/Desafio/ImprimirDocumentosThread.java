package com.fraga.intermediario.Aula71.Desafio;

public class ImprimirDocumentosThread implements Runnable{
    private String tarefa;
    private int Folhas;
    private int tempo;
    private static ImpressoraThread impressora = new ImpressoraThread();

    public ImprimirDocumentosThread(String tarefa, int qntFolhas, int tempo) {
        this.tarefa = tarefa;
        this.Folhas = qntFolhas;
        this.tempo = tempo;

//        Thread thread = new Thread(this);
//        thread.start();

        new Thread(this, tarefa).start();
    }


    @Override
    public void run() {
        System.out.println("Imprimindo documento: "+ tarefa);
        int Folhas = impressora.ImpressoraThread(this.Folhas, this.tempo);
        System.out.println("Fim da impressão de "+ Folhas +" folhas.");
    }
}
