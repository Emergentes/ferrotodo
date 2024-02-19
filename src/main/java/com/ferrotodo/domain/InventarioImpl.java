package com.ferrotodo.domain;

import com.ferrotodo.domain.entities.Producto;
import com.ferrotodo.domain.negocio.Inventario;

public class InventarioImpl implements Inventario {
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
