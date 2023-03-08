package com.example.torneo.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDateTime fecha;
    private String lugar;
    private FechaTorneo fechaTorneo;

    public Partido(Equipo equipoLocal,Equipo equipoVisitante){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String toString(){
        return equipoLocal.toString() +" vs " + equipoVisitante.toString() + "\n";

    }
}
