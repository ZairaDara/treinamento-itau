package br.com.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class PrincipalCotacao {
    public static void main(String[] args) {

        Double  vlrcotacao;
        Double  vlrEmDolar;
        Double  vlrConvertido;

        Cotacao cotacao = new Cotacao();

        vlrcotacao =    cotacao.obterCotacao();
        vlrEmDolar =    cotacao.obtervalorConverter();

        System.out.println("->"+ vlrEmDolar + " dolares corresponde a " + vlrcotacao * vlrEmDolar + " Reais.");

    }
}
