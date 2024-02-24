package com.ferrotodo.domain.ports.input;

import com.ferrotodo.models.Ferreteria;

import java.util.List;

public interface Crudable {
    List<Object> encontrarPorNombre(Object id);
    Object crear(Object entidad);
    void actualizar(Object id, Object entidad);
    void eliminarPorId(Object id);
}
