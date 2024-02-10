package com.ferrotodo.models;

import com.ferrotodo.domain.enumer.Turno;

import java.util.List;


public class Administrador {

    private Long id;
    private String nombre;
    private Long salario;
    private Turno turno;

    //Aqui me pregunto a mi mismo, entre Admin y Ferreteria: ¿que quiero hacer?, registrar quien es el admin de cual ferreteria?
    private List<GestionPersonal> gestionPersonals;


}
