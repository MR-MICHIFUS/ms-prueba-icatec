package com.icatec.prueba.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

}
