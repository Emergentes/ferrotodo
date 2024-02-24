package com.ferrotodo.domain.ports.input;

import com.ferrotodo.domain.entities.Cliente;

import java.util.List;

public interface ClienteCrudable {
    List<Cliente> encontrarClientePorNombre(Long id);
    Cliente crear(Cliente entidad);
    void actualizar(Long id, Cliente entidad);
    void eliminarClientePorId(Long id);
}
