package com.worchock.recetascomidas.services;

import com.worchock.recetascomidas.model.UsuariosModel;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    public List<UsuariosModel> findAll();

    public Optional<UsuariosModel> findById(Long id);

    public Optional<UsuariosModel> findByNombreUsuarioOrCorreoElectronico(String nombreUsuario,String correoElectronico);

    public Optional<UsuariosModel> findByCorreoElectronicoAndContrasena(String correoElectronico,String contrasena);

    public UsuariosModel saveNuevoUsuario(UsuariosModel usuariosModel);

    public Optional<UsuariosModel> findByNombreUsuarioAndContrasena(String nombreUsuario, String contrasena);

    public Optional<UsuariosModel> findByCorreoElectronico(String correoElectrnoico);


}
