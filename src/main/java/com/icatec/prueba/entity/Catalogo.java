package com.icatec.prueba.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "catalogo")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalogo_id", columnDefinition = "SMALLINT")
    private Short id;
    private String tipo;
    @Column(name = "codigo", columnDefinition = "CHAR")
    private String codigo;

    private String valor;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
