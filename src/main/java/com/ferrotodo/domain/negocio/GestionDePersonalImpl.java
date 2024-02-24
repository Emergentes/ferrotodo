package com.ferrotodo.domain.negocio;

import com.ferrotodo.domain.entities.Administrador;
import com.ferrotodo.domain.entities.Vendedor;
import com.ferrotodo.domain.ports.input.Gestionable;
import com.ferrotodo.models.Ferreteria;

import java.util.List;

public class GestionDePersonalImpl implements Gestionable {

    @Override
    public List<Administrador> encontrarAdministradorPorNombre(Long id) {
        return null;
    }

    @Override
    public Administrador crear(Administrador entidad) {
        return null;
    }

    @Override
    public void actualizar(Long id, Administrador entidad) {

    }

    @Override
    public void eliminarAdministradorPorId(Long id) {

    }

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
    public List<Vendedor> encontrarVendedorPorNombre(Long id) {
        return null;
    }

    @Override
    public Vendedor crear(Vendedor entidad) {
        return null;
    }

    @Override
    public void actualizar(Long id, Vendedor entidad) {

    }

    @Override
    public void eliminarVendedorPorId(Long id) {

    }
}
