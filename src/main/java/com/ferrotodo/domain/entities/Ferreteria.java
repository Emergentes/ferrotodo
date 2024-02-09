package com.ferrotodo.domain.entities;

import com.ferrotodo.domain.enumer.ClasificacionFerreteria;

import java.util.List;

public class Ferreteria {

    private Long id;
    private String nombre;
    private String ubucacion;
    private ClasificacionFerreteria categoria;

    private List<Inventario> inventarioList;
    private List<GestionPersonal> gestionPersonals;


}
