package br.com.letscode.turmaitau.operacoes;

public class Tabuada {

    public void realizarOperacao(double multiplicando, double limite){

        Multiplicar multiplicar = new Multiplicar();

        for (double i = 0; i <= limite ; i++) {
            multiplicar.realizarOperacao(multiplicando, i);

        }

    }
}
