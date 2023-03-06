package com.example.torneo.model;

import lombok.Data;

import java.util.List;
@Data
public class FechaTorneo {
    private Integer fecha;
    private List<Partido> partidos;

    public void agregarPartido(Partido partido){
        this.partidos.add(partido);
    }
}
