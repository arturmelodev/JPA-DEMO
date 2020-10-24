package com.turmelo.jpa.demo.model;

import javax.persistence.*;

@Entity
public class Modelo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "descricao", length = 255)
    private String descricao;

    @Column(name = "potencia", length = 11)
    private Integer potencia;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    protected Modelo() {

    }

    public Modelo(String descricao, Integer potencia, Marca marca) {
        this.descricao = descricao;
        this.potencia = potencia;
        this.marca = marca;
    }


    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", potencia=" + potencia +
                ", marca=" + marca +
                '}';
    }
}
