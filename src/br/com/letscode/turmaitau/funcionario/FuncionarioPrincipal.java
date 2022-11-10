package br.com.letscode.turmaitau.funcionario;

import java.math.BigDecimal;
import java.net.Socket;
import java.util.Scanner;

public class FuncionarioPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do Funcionario:");
        String nomeFuncionario= entrada.next();

        System.out.println("Informe o cpf do Funcionario:");
        String cpfFuncionario= entrada.next();

        System.out.println("Informe o salario base do Funcionario: ");
        BigDecimal salarioBase= entrada.nextBigDecimal();

        Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, salarioBase);

        System.out.println("Informe o número de dias trabalhados: ");
        Integer numDiasTrabalhados = entrada.nextInt();

        BigDecimal salarioPeriodo = funcionario.retornaSalario(numDiasTrabalhados);

        System.out.println("O salário do Funcionário no período é " + salarioPeriodo);

        System.out.println(funcionario);

    }



}
