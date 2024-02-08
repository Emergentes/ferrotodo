package com.ferrotodo.domain.enumer;

public enum Turno {

    PRIMER("Mañana"),
    SEGUNDO("Tarde"),
    TERCER("Noche");

    private String turno;

    Turno(String turno){
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
}
