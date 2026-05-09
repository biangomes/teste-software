package br.beanascigom.testesoftware;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private String produto;
    private String descricao;
    private List<Lance> lances;

    public Leilao() {
        this.lances = new ArrayList<>();
    }

    public Leilao(String produto, String descricao, List<Lance> lances) {
        this.produto = produto;
        this.descricao = descricao;
        this.lances = lances != null ? lances : new ArrayList<>();
    }

    public Leilao(String produto, String descricao) {
        this.produto = produto;
        this.descricao = descricao;
        this.lances = new ArrayList<>();
    }

    public List<Lance> getLances() {
        return this.lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances != null ? lances : new ArrayList<>();
    }

    public String getProduto() {
        return this.produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void propoe(Lance lance) {
        if (lance != null && lance.getValor() != null) {
            lance.setLeilao(this);
            this.lances.add(lance);
        }
    }
}
