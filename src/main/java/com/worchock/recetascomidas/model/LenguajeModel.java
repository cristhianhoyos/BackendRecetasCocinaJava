package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name="Lenguaje")
@Data
public class LenguajeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombreLenguaje")
    private String nombreLenguaje;

    @Column(name = "lenguaje")
    private String lenguaje;

    private static final long serialVersionUID = 1L;
}
