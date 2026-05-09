package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class TesteDoAvaliador {
    public static void main(String[] args) {
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

        System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        System.out.println(menorEsperado == leiloeiro.getMenorLance());
    }
}
