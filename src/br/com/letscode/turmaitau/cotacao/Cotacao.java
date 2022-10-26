package br.com.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class Cotacao {
    public double obterCotacao(){

        Double CotacaoDolar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da cotação do Dolar: ");
        CotacaoDolar = entrada.nextDouble();
        return CotacaoDolar;
    }
    public double obtervalorConverter(){

        Double vlrDolar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor em Dólares que vc deseja converter para Reais: ");
        vlrDolar = entrada.nextDouble();
        return vlrDolar;
    }


}
