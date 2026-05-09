package br.beanascigom.testesoftware;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AvaliadorTest {

    @Test
    void deveEncontrarOMaiorLance() {
        Leilao leilao = new Leilao("Bike", "Bike usada");
        leilao.propoe(new Lance(new Usuario("Ana"), new BigDecimal("300.00")));
        leilao.propoe(new Lance(new Usuario("Bruno"), new BigDecimal("450.00")));
        leilao.propoe(new Lance(new Usuario("Carlos"), new BigDecimal("400.00")));

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        assertEquals(new BigDecimal("450.00"), avaliador.getMaiorLance());
    }

    @Test
    void deveLancarExcecaoQuandoLeilaoNaoTemLances() {
        Leilao leilao = new Leilao("Console", "Console seminovo");
        Avaliador avaliador = new Avaliador();

        assertThrows(IllegalArgumentException.class, () -> avaliador.avalia(leilao));
    }
}

