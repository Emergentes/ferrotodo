package com.ferrotodo.domain.negocio;

import com.ferrotodo.domain.entities.Producto;
import com.ferrotodo.domain.ports.input.Inventable;

public class InventarioImpl implements Inventable {
    @Override
    public void agregarProducto(Producto producto, int cantidad) {

    }

    @Override
    public void reducirProducto(Producto producto, int cantidad) {

    }

    @Override
    public int obtenerCantidad(Producto producto) {
        return 0;
    }

}
