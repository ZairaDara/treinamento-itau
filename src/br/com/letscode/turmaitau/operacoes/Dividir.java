package br.com.letscode.turmaitau.operacoes;

public class Dividir implements Calculadora {
    public void realizarOperacao(double varnum1, double varnum2){
        System.out.printf("Resultado: %.2f / %.2f = %.2f %s", varnum1, varnum2, (varnum1/varnum2), "!" );
    }

}
