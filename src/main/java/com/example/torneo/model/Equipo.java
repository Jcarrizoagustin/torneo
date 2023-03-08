package com.example.torneo.model;

import lombok.Data;

import java.util.List;
@Data
public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
