package com.ferrotodo.domain.ports.input;

import com.ferrotodo.domain.entities.Vendedor;

import java.util.List;

public interface VendedorCrudable {
    List<Vendedor> encontrarVendedorPorNombre(Long id);
    Vendedor crear(Vendedor entidad);
    void actualizar(Long id, Vendedor entidad);
    void eliminarVendedorPorId(Long id);
}
