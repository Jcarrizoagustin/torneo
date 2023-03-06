package com.example.torneo.model;

import lombok.Data;

import java.util.List;
@Data
public class TorneoUnaRonda implements Torneo{
    private String nombre;
    private List<Equipo> equipos;
}
