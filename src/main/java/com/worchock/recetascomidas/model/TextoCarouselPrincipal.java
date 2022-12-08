package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TEXTO_CAROUSEL")
@Data
public class TextoCarouselPrincipal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="titulo")
    private String titulo;

    @Column(name="descrpcion")
    private String descripcion;

    @Column(name = "textButton")
    private String textButton;

    @Column(name = "navigationPage")
    private String navigationPage;

    @Column(name = "idLenguaje")
    private String idLenguaje;

    private static final long serialVersionUID = 1L;
}
