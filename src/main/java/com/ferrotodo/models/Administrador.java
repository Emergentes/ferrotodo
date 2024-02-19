package com.ferrotodo.models;

import com.ferrotodo.domain.enumer.Turno;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Long salario;

    //El error era que el jpa no reconoce Turno como un tipo de atributo valido ya que es una clase o un enum o una lista etc.
    @Enumerated(EnumType.STRING)
    private Turno turno;

    //Aqui me pregunto a mi mismo, entre Admin y Ferreteria: ¿que quiero hacer?, registrar quien es el admin de cual ferreteria?
    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GestionPersonal> gestionPersonals;


}
