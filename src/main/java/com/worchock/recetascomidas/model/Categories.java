package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name="categories")
@Entity
public class Categories implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombreCategoria")
    private String nombreCategoria;

    @Column(name="idLenguaje")
    private int idLenguaje;

    @Lob
    @Column(name = "imageCategoria", length = 1000)
    private byte[] imageData;


    private static final long serialVersionUID = 1L;
}
