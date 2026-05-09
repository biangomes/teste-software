package br.beanascigom.testesoftware;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeilaoTest {

    @Test
    void deveAdicionarLanceValido() {
        Leilao leilao = new Leilao("Celular", "Celular usado");
        Lance lance = new Lance(new Usuario("Daniela"), new BigDecimal("900.00"));

        leilao.propoe(lance);

        assertEquals(1, leilao.getLances().size());
        assertEquals(leilao, lance.getLeilao());
    }

    @Test
    void deveIgnorarLanceNulo() {
        Leilao leilao = new Leilao("Camera", "Camera semi profissional");

        leilao.propoe(null);

        assertEquals(0, leilao.getLances().size());
    }
}

