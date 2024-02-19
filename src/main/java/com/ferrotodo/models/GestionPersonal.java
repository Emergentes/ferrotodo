package com.ferrotodo.models;

import jakarta.persistence.*;

@Entity
public class GestionPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ferreteria")
    private Ferreteria ferreteria;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_administrador")
    private Administrador administrador;


}
