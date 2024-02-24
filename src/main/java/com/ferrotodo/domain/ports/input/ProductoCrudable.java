package com.ferrotodo.domain.ports.input;

import com.ferrotodo.domain.entities.Producto;

import java.util.List;

public interface ProductoCrudable {
    List<Producto> encontrarProductoPorNombre(Long id);
    Producto crear(Producto entidad);
    void actualizar(Long id, Producto entidad);
    void eliminarProductoPorId(Long id);
}
