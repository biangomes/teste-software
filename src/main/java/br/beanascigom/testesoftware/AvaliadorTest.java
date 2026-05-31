package br.beanascigom.testesoftware;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Test
class AvaliadorTest {

    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario jose;
    private Usuario maria;

    @Before
    public void criaAvaliador() {
        this.leiloeiro = new Avaliador();
        this.joao = new Usuario("Joao");
        this.jose = new Usuario("Jose");
        this.maria = new Usuario("Maria");
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        criaAvaliador();
        Leilao leilao = new Leilao("Playstation 5 Novo");
        leilao.propoe(new Lance(joao, 2000.00));
        leilao.propoe(new Lance(jose, 3000.00));
        leilao.propoe(new Lance(maria, 4000.00));

        // executando a ação
        leiloeiro.avalia(leilao);

        // comparando a saída com o esperado
        double maiorEsperado = 4000.00;
        double menorEsperado = 2000.00;

        assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {
        criaAvaliador();
        Leilao leilao = new Leilao("iPhone 17 Pro Max");

        leilao.propoe(new Lance(joao, 5000.00));
        leilao.propoe(new Lance(jose, 8000.00));
        leilao.propoe(new Lance(maria, 7500.00));

        leiloeiro.avalia(leilao);

        assertEquals(8000.00, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(5000.00, leiloeiro.getMenorLance(), 0.00001);
    }

    @Test
    public void deveEncontrarOsTresMaioresLances() {
        Leilao leilao = new Leilao("Playstation 5 Novo");

        leilao.propoe(new Lance(joao, 2000.00));
        leilao.propoe(new Lance(maria, 3000.00));
        leilao.propoe(new Lance(joao, 4000.00));
        leilao.propoe(new Lance(maria, 5000.00));
        leiloeiro.avalia(leilao);
        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());
    }

    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
        Leilao leilao = new Leilao("Macbook Pro 15");
        Usuario steveJobs = new Usuario("Steve Jobs");
        leilao.propoe(new Lance(steveJobs, 2000.00));
        leilao.propoe(new Lance(steveJobs, 3000.00));
        assertEquals(1, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
    }
}
