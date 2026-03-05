package com.fraga.intermediario.Aula74;

import com.fraga.intermediario.Aula69.corSemaforo;

import java.util.TreeMap;

public class MinhaThread implements Runnable{
    private corSemaforo cor;
    private boolean interromper;
    private boolean corMudou;

    public MinhaThread() {
        this.cor = corSemaforo.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!interromper){
            try {
                switch (this.cor){
                case VERMELHO:
                    Thread.sleep(4000);
                    break;
                case AMARELO:
                    Thread.sleep(2000);
                    break;
                case VERDE:
                    Thread.sleep(8000);
                    break;
                default:
                    break;
                }
                //mudar a Cor
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.cor){
            case VERMELHO:
                this.cor = corSemaforo.VERDE;
                break;
            case VERDE:
                this.cor = corSemaforo.AMARELO;
                break;
            case AMARELO:
                this.cor = corSemaforo.VERMELHO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar(){
        while (!this.corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public corSemaforo getCor() {
        return cor;
    }

    public synchronized void desligarSemaforo(){
        this.interromper = true;
    }
}
