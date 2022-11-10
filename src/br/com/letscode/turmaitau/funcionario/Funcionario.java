package br.com.letscode.turmaitau.funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private String cpf;
    private BigDecimal salarioBase;

    public Funcionario(String nomeFuncionario, String cpfFuncionario, BigDecimal salarioBase) {
        this.nome = nomeFuncionario;
        this.cpf = cpfFuncionario;
        this.salarioBase = salarioBase;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public BigDecimal retornaSalario(Integer NumDiasTrabalhados) {
        BigDecimal salarioPeriodo;
        BigDecimal salarioDia;

        salarioDia = salarioBase.divide(new BigDecimal(30.0000),RoundingMode.UP);

        salarioPeriodo = salarioDia.multiply(new BigDecimal(NumDiasTrabalhados));


        return salarioPeriodo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return nome.equals(that.nome) && cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
