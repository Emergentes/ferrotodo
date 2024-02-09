package com.ferrotodo.port;

public interface ClienteManager {

    void comprar(Long idProducto);
    void reservarProducto(Long idProducto);

    //Agregaremos los demas si hace falta
}
