package com.ferrotodo.models;

import com.ferrotodo.domain.enumer.TipoProducto;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {
    //ESTRATEGIA EVERGREEN, osea, que todos los pasos funcionaran si o si
    //un producto tiene un margen de rentabilidad (buena utilidad)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private TipoProducto categoria;
    private boolean tieneServicioTec;
    private boolean tieneRepuestos;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventario> inventarioList;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proveedor> proveedorsList;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transaccionList;

}
