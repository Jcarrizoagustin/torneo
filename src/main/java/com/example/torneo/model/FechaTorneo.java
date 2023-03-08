package com.example.torneo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class FechaTorneo {
    private Integer fecha;
    private List<Partido> partidos;

    public FechaTorneo(int fecha){
        this.fecha = fecha;
        this.partidos = new ArrayList<>();
    }

    public void agregarPartido(Partido partido){
        this.partidos.add(partido);
    }
    @Override
    public String toString(){
        String fechaString = "\n** Fecha: "+ fecha.toString()+"\n";
        for(Partido partido : partidos){
            fechaString+=partido.toString();
        }
        return fechaString;

    }
}
