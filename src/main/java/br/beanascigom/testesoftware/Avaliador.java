package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class Avaliador {
    private BigDecimal maiorDeTodos = BigDecimal.ZERO;

    public void avalia(Leilao leilao) {
        if (leilao == null || leilao.getLances() == null || leilao.getLances().isEmpty()) {
            throw new IllegalArgumentException("Leilao sem lances para avaliacao");
        }

        this.maiorDeTodos = BigDecimal.ZERO;

        for (Lance lance : leilao.getLances()) {
            if (lance != null && lance.getValor() != null && lance.getValor().compareTo(this.maiorDeTodos) > 0) {
                this.maiorDeTodos = lance.getValor();
            }
        }
    }

    public BigDecimal getMaiorLance() {
        return this.maiorDeTodos;
    }
}
