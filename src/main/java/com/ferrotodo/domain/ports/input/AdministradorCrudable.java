package com.ferrotodo.domain.ports.input;

import com.ferrotodo.domain.entities.Administrador;

import java.util.List;

public interface AdministradorCrudable {
    List<Administrador> encontrarAdministradorPorNombre(Long id);
    Administrador crear(Administrador entidad);
    void actualizar(Long id, Administrador entidad);
    void eliminarAdministradorPorId(Long id);
}
