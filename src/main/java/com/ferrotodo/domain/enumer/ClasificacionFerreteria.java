package com.ferrotodo.domain.enumer;

//Esto se invoca como una clase statica se tratase
public enum ClasificacionFerreteria {
    SMALL("Pequeña"),
    MEDIUM("Mediana"),
    BIG("Grande");

    private String categoria;

    ClasificacionFerreteria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

}
