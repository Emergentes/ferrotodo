package com.ferrotodo.domain.entities;

import com.ferrotodo.domain.enumer.TipoProducto;

public class Producto {
    //ESTRATEGIA EVERGREEN, osea, que todos los pasos funcionaran si o si
    //un producto tiene un margen de rentabilidad (buena utilidad)

    private Long id;
    private String nombre;
    private TipoProducto categoria;
    private boolean tieneServicioTec;
    private boolean tieneRepuestos;


}
