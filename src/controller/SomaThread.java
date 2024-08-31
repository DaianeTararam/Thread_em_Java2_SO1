//@author Daiane Tararam

package controller;

public class SomaThread extends Thread {
    private int[] linha;
    private int numeroLinha;

    public SomaThread(int[] linha, int numeroLinha) {
        this.linha = linha;
        this.numeroLinha = numeroLinha;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int num : linha) {
            soma += num;
        }
        System.out.println("Linha" + numeroLinha + ": " + soma);
    }
}

