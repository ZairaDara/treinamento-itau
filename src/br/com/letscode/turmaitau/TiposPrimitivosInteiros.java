package br.com.letscode.turmaitau;

public class TiposPrimitivosInteiros {

    final static int NUMERO_INT = 5;
    final static String RESULTADO= "Resultado da ";
    public static void main(String[] args) {

      //a diferença entre esses tipos é o numero de caracteres que cabem em cada um deles
        short   b = 1;
        int     numeroInt   = 5;
        long    numeroLong  = 2;





        //operadores no java soma + subtração - divisão / multiplicação *

        int soma = numeroInt + 10;
        int divisao = numeroInt / (int) numeroLong;
        System.out.println(RESULTADO + "soma:" + soma);
        somar((int) numeroLong, numeroInt);
    }

    static void somar(int var1, int var2){
        int soma = var1 + var2 + NUMERO_INT +(int) Math.PI;
        System.out.println(RESULTADO+ "soma " + soma);
    }
}
