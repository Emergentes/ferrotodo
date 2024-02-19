package com.ferrotodo.models;

import com.ferrotodo.domain.enumer.ClasificacionFerreteria;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ferreteria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String ubucacion;
    @Enumerated(EnumType.STRING)
    private ClasificacionFerreteria categoria;

    @OneToMany(mappedBy = "ferreteria", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "ferreteria", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GestionPersonal> gestionPersonals;

}
