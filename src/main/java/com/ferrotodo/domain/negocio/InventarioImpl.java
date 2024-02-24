package com.ferrotodo.domain.negocio;

import com.ferrotodo.domain.entities.Producto;
import com.ferrotodo.domain.ports.input.Inventable;
import com.ferrotodo.models.Ferreteria;

import java.util.List;

public class InventarioImpl implements Inventable {

    @Override
    public List<Ferreteria> encontrarFerreteriaPorNombre(Long id) {
        return null;
    }

    @Override
    public Ferreteria crear(Ferreteria entidad) {
        return null;
    }

    @Override
    public void actualizar(Long id, Ferreteria entidad) {

    }

    @Override
    public void eliminarFerreteriaPorId(Long id) {

    }

    @Override
    public List<Producto> encontrarProductoPorNombre(Long id) {
        return null;
    }

    @Override
    public Producto crear(Producto entidad) {
        return null;
    }

    @Override
    public void actualizar(Long id, Producto entidad) {

    }

    @Override
    public void eliminarProductoPorId(Long id) {

    }

}
