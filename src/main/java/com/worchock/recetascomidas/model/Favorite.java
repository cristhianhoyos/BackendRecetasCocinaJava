package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name="favorite")
@Entity
public class Favorite  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="idUsuario")
    private int idUsuario;

    @Column(name="idComida")
    private int idComida;


    private static final long serialVersionUID = 1L;
}
