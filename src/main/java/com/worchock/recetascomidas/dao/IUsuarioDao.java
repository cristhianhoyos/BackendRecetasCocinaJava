package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.UsuariosModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUsuarioDao extends CrudRepository<UsuariosModel,Long> {

    public Optional<UsuariosModel> findByNombreUsuarioOrCorreoElectronico(String nombreUsuario,String correoElectronico);

    public Optional<UsuariosModel> findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena);

    public Optional<UsuariosModel> findById(Long id);

    public Optional<UsuariosModel> findByNombreUsuarioAndContrasena(String nombreUsuario, String contrasena);

    public Optional<UsuariosModel> findByCorreoElectronico(String correoElectronico);
}
