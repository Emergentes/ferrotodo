package com.ferrotodo.domain.negocio;

import com.ferrotodo.domain.entities.Producto;

import java.util.HashMap;
import java.util.Map;


//Esta Interfaz es un PUERTO
public interface Inventario {
    // Atributo para almacenar los productos y sus cantidades
    //private Map<Producto, Integer> productos;


    /*public Inventario() {
        this.productos = new HashMap<>();
    }*/


    // Método para agregar productos al inventario
    void agregarProducto(Producto producto, int cantidad);
    //{
        //int cantidadActual = productos.getOrDefault(producto, 0);
        //productos.put(producto, cantidadActual + cantidad);
    //}

    // Método para reducir la cantidad de un producto en el inventario
    void reducirProducto(Producto producto, int cantidad);
    //{
        /*if (!productos.containsKey(producto) || productos.get(producto) < cantidad) {
            System.out.println("No hay suficiente stock del producto: " + producto.getNombre());
            return;
        }
        productos.put(producto, productos.get(producto) - cantidad);*/
    //}

    // Método para obtener la cantidad actual de un producto en el inventario
    int obtenerCantidad(Producto producto);
    //{
        //return productos.getOrDefault(producto, 0);
    // return 0;
    //}
}
