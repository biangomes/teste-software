package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class Avaliador {
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;

    public void avalia(Leilao leilao) {
        for (Lance lance : leilao.getLances()) {
            if (lance.getValor() > maiorDeTodos) {
                maiorDeTodos = lance.getValor();
            }
            if (lance.getValor() < menorDeTodos || menorDeTodos == 0.00) {
                menorDeTodos = lance.getValor();
            }
        }
    }

    public double getMaiorLance() {
        return this.maiorDeTodos;
    }

    public double getMenorLance() {
        return this.menorDeTodos;
    }
}