package br.com.letscode.turmaitau.operacoes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Realiza as minhas operações da calculadora - aciona as classes

       Calculadora calculadora = new Dividir();

       calculadora.realizarOperacao(4,2);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite outro numero:");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operação:");
        String operador = entrada.next();

        switch (operador) {
            case "/":
            new Dividir().realizarOperacao(numero1, numero2);
            break;

            case "t":
                new Tabuada().realizarOperacao(numero1, numero2);
                break;

            case "+":
                new Somar().realizarOperacao(numero1, numero2);
                break;

            case "-":
                new Subtrair().realizarOperacao(numero1, numero2);
                break;

            case "x":
                new Multiplicar().realizarOperacao(numero1, numero2);
                break;

            default:
                System.out.printf("operador invalido");
                break;
        }

    }
}
