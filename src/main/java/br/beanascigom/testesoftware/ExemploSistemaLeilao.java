package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class ExemploSistemaLeilao {

    public static void main(String[] args) {
        Usuario maria = new Usuario("Maria");
        Usuario joao = new Usuario("Joao");

        Leilao leilao = new Leilao("Notebook", "Notebook gamer em bom estado");
        leilao.propoe(new Lance(maria, 1500.00));
        leilao.propoe(new Lance(joao, 1800.00));
        leilao.propoe(new Lance(maria, 2100.00));

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        System.out.println("Produto: " + leilao.getProduto());
        System.out.println("Descricao: " + leilao.getDescricao());
        System.out.println("Total de lances: " + leilao.getLances().size());
        System.out.println("Maior lance: R$ " + avaliador.getMaiorLance());
    }
}

