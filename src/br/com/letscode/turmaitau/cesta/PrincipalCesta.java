package br.com.letscode.turmaitau.cesta;

import java.util.Scanner;

public class PrincipalCesta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeProduto = null;
        String menorProduto = null;
        String maiorproduto = null;
        Double precoproduto = 0.0;
        Double maiorPreco = 0.0;
        Double menorPreco = 0.0;
        String finalizar = "";
        int i= 0;

        do {
            System.out.println("Informe o nome do produto: ");
            nomeProduto = entrada.next();

            do {
                System.out.println("Informe o preço do produto "+ nomeProduto +", em reais (valores acima de R$ 0.0):");
                precoproduto = entrada.nextDouble();
            } while (precoproduto<=0.0);


            i++;
            if (precoproduto > maiorPreco)
            {
                maiorPreco      = precoproduto;
                maiorproduto    = nomeProduto;
            }else
            {
                menorPreco      = precoproduto;
                menorProduto    = nomeProduto;
            }

            System.out.println("Deseja finalizar a operação (s|n)");
            finalizar = entrada.next();

            if (finalizar.equals("s"))
            {
                if (i==1){
                    System.out.println("O produto "+ maiorproduto + " de R$ " + maiorPreco + " é o único produto digitado, portanto não foi possível realizar a comparação de preços.");
                    System.out.println("Até logo!");
                    entrada.close();
                    break;
                } else {

                    if (menorPreco.equals(maiorPreco)){
                        System.out.println("Todos os produtos da lista tem o mesmo preço R$ " + precoproduto +", portanto não é possível fazer comparação.");
                        System.out.println("Até logo!");
                        entrada.close();
                        break;
                    } else {
                    System.out.println("O produto "+ maiorproduto + " de R$ " + maiorPreco + " é o mais caro da sua lista.");
                    System.out.println("O produto "+ menorProduto + " de R$ " + menorPreco + " é o mais barato da sua lista.");
                    System.out.println("Até logo!");
                    entrada.close();
                    break;
                    }
                }

            }

        }while (true);

    }
       
}
