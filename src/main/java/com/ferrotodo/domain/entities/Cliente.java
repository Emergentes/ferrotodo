package com.ferrotodo.domain.entities;

import com.ferrotodo.domain.enumer.TipoCliente;

import java.util.List;

public class Cliente {

    private Long id;
    private String nombre;
    private Long telefono;
    private TipoCliente tipoCliente;


    private List<Transaccion> transaccionList;


}
