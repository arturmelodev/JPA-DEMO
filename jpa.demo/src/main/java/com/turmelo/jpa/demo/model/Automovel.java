package com.turmelo.jpa.demo.model;

import javax.persistence.*;

@Entity
public class Automovel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "ano_fabricacao", length = 11)
    private Integer anoFabricacao;

    @Column(name = "ano_modelo", length = 11)
    private Integer anoModelo;

    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "preco")
    private Float preco;

    @Column(name = "kilometragem", length = 11)
    private Integer kilometragem;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    protected Automovel() {

    }

    public Automovel(Integer anoFabricacao, Integer anoModelo, String observacoes, Float preco, Integer kilometragem, Modelo modelo) {
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.observacoes = observacoes;
        this.preco = preco;
        this.kilometragem = kilometragem;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Integer kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", anoFabricacao=" + anoFabricacao +
                ", anoModelo=" + anoModelo +
                ", observacoes='" + observacoes + '\'' +
                ", preco=" + preco +
                ", kilometragem=" + kilometragem +
                ", modelo_id=" + modelo +
                '}';
    }
}
