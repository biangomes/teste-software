package br.beanascigom.testesoftware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void desenvolvedorComSalarioMaiorOuIgualA3000DeveDescontarVintePorCento() {
        Funcionario f = new Funcionario("Ana", "ana@email.com",
                Cargo.DESENVOLVEDOR, new BigDecimal("5000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("4000.00"), salarioLiquido);
    }

    @Test
    void desenvolvedorComSalarioExatamenteIgualA3000DeveDescontarVintePorCento() {
        Funcionario f = new Funcionario("Ana", "ana@email.com",
                Cargo.DESENVOLVEDOR, new BigDecimal("3000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("2400.00"), salarioLiquido);
    }

    @Test
    void desenvolvedorComSalarioMenorQue3000DeveDescontarDezPorCento() {
        Funcionario f = new Funcionario("Ana", "ana@email.com",
                Cargo.DESENVOLVEDOR, new BigDecimal("2000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("1800.00"), salarioLiquido);
    }

    @Test
    void dbaComSalarioMaiorOuIgualA2000DeveDescontarVinteCincoPorCento() {
        Funcionario f = new Funcionario("Bob", "bob@email.com",
                Cargo.DBA, new BigDecimal("3000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("2250.00"), salarioLiquido);
    }

    @Test
    void dbaComSalarioExatamenteIgualA2000DeveDescontarVinteCincoPorCento() {
        Funcionario f = new Funcionario("Bob", "bob@email.com",
                Cargo.DBA, new BigDecimal("2000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("1500.00"), salarioLiquido);
    }

    @Test
    void dbaComSalarioMenorQue2000DeveDescontarQuinzePorCento() {
        Funcionario f = new Funcionario("Bob", "bob@email.com",
                Cargo.DBA, new BigDecimal("1000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("850.00"), salarioLiquido);
    }

    @Test
    void testadorComSalarioMaiorOuIgualA2000DeveDescontarVinteCincoPorCento() {
        Funcionario f = new Funcionario("Carol", "carol@email.com",
                Cargo.TESTADOR, new BigDecimal("2500.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("1875.00"), salarioLiquido);
    }

    @Test
    void testadorComSalarioMenorQue2000DeveDescontarQuinzePorCento() {
        Funcionario f = new Funcionario("Carol", "carol@email.com",
                Cargo.TESTADOR, new BigDecimal("550.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("467.50"), salarioLiquido);
    }

    @Test
    void gerenteComSalarioMaiorOuIgualA5000DeveDescontarTrintaPorCento() {
        Funcionario f = new Funcionario("Davi", "davi@email.com",
                Cargo.GERENTE, new BigDecimal("6000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("4200.00"), salarioLiquido);
    }

    @Test
    void gerenteComSalarioExatamenteIgualA5000DeveDescontarTrintaPorCento() {
        Funcionario f = new Funcionario("Davi", "davi@email.com",
                Cargo.GERENTE, new BigDecimal("5000.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("3500.00"), salarioLiquido);
    }

    @Test
    void gerenteComSalarioMenorQue5000DeveDescontarVintePorCento() {
        Funcionario f = new Funcionario("Davi", "davi@email.com",
                Cargo.GERENTE, new BigDecimal("2500.00"));
        BigDecimal salarioLiquido = calculadora.calcula(f);
        assertEquals(new BigDecimal("2000.00"), salarioLiquido);
    }
}
