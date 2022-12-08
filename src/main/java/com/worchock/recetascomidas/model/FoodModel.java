package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name="TABLE_FOOD")
@Data
public class FoodModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="idLenguaje")
    private int idLenguaje;

    @Column(name="categoria")
    private String categoria;
    @Column(name="idUsuario")
    private int idUsuario;
    @Column(name="favoriteUser")
    private boolean favoriteUser;
    @Column(name="favorito")
    private boolean favorito;
    @Column(name="nombreComida")
    private String nombreComida;
    @Column(name="descripcionComida")
    private String descripcionComida;
    @Lob
    @Column(name= "imageData", length = 1000)
    private String foto;

    @Column(name="lenguajeEspanol")
    private String lenguajeEspañol;
    @Column(name="lenguajeIngles")
    private String lenguajeInglés;
    @Column(name="lenguajeCoreano")
    private String lenguajeCoreano;


    private static final long serialVersionUID = 1L;

}
