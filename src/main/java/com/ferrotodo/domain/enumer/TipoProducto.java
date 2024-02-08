package com.ferrotodo.domain.enumer;

public enum TipoProducto {
    ESPECIAL("Especial"),
    REGULAR("Regular"),
    ESTRELLA("Estrella");

    private String categoria;

    TipoProducto(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

}
