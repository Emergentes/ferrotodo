package com.ferrotodo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vendedor {
    //bueno ya sabemos para que es
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Long telefono;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transaccionList;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GestionPersonal> gestionPersonals;


}
