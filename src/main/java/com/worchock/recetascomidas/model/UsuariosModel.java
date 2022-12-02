package com.worchock.recetascomidas.model;

import lombok.Data;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Table(name = "Usuarios")
@Entity
@Data
public class UsuariosModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdUser;

    @Column(name = "nombreusuario")
    private String nombreUsuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "correoelectronico")
    private String correoElectronico;

    @Column(name = "idLenguaje")
    private int idLenguaje;

    private static final Long serialVersionUID= 1L;
}
