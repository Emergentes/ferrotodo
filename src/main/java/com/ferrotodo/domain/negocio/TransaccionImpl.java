package com.ferrotodo.domain.negocio;

import com.ferrotodo.domain.entities.Cliente;
import com.ferrotodo.domain.entities.Producto;
import com.ferrotodo.domain.entities.Vendedor;
import com.ferrotodo.domain.ports.input.Transaccionable;

import java.util.List;

public class TransaccionImpl implements Transaccionable {

    @Override
    public List<Cliente> encontrarClientePorNombre(Long id) {
        return null;
    }

    @Override
    public Cliente crear(Cliente entidad) {
        return null;
    }

    @Override
    public void actualizar(Long id, Cliente entidad) {

    }

    @Override
    public void eliminarClientePorId(Long id) {

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
