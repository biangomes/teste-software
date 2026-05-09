package br.beanascigom.testesoftware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AvaliadorTest {

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 5 Novo");
        leilao.propoe(new Lance(joao, 2000.00));
        leilao.propoe(new Lance(jose, 3000.00));
        leilao.propoe(new Lance(maria, 4000.00));

        // executando a ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        // comparando a saída com o esperado
        double maiorEsperado = 4000.00;
        double menorEsperado = 2000.00;

        Assertions.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assertions.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");
        Leilao leilao = new Leilao("iPhone 17 Pro Max");

        leilao.propoe(new Lance(joao, 5000.00));
        leilao.propoe(new Lance(jose, 8000.00));
        leilao.propoe(new Lance(maria, 7500.00));

        Avaliador leiloeiro = new Avaliador();

        leiloeiro.avalia(leilao);

        Assertions.assertEquals(8000.00, leiloeiro.getMaiorLance(), 0.00001);
        Assertions.assertEquals(5000.00, leiloeiro.getMenorLance(), 0.00001);
    }
}
