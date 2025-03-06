package com.icatec.prueba.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipo_doc_identidad")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_doc_identidad_cod", columnDefinition = "CHAR")
    private String codigo;

    private String descripcion;

    @Column(name = "maximo_caracteres", columnDefinition = "TINYINT")
    private String maximoCaracteres;

    @Column(name = "expresion_regular", columnDefinition = "VARCHAR")
    private String expresionRegular;

}
