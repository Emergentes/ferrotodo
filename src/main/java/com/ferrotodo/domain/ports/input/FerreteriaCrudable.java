package com.ferrotodo.domain.ports.input;

import com.ferrotodo.models.Ferreteria;

import java.util.List;

public interface FerreteriaCrudable {
    List<Ferreteria> encontrarFerreteriaPorNombre(Long id);
    Ferreteria crear(Ferreteria entidad);
    void actualizar(Long id, Ferreteria entidad);
    void eliminarFerreteriaPorId(Long id);
}
