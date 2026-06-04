package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String email;
    private Cargo cargo;
    private BigDecimal salario;

    public Funcionario() {}

    public Funcionario(String nome, String email, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
