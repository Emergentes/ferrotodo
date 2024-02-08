package com.ferrotodo.domain.enumer;

public enum TipoCliente {

    OCASIONAL("Ocasional"),
    HABITUAL("Habitual"),
    VIP("VIP");


    private String categoria;

    TipoCliente(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

}
