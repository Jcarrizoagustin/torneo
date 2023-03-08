package com.example.torneo.model;

import lombok.Data;

@Data
public class EstadisticaEquipo{
    private Equipo equipo;
    private Integer partidosJugados;
    private Integer partidosGanados;
    private Integer partidosEmpatados;
    private Integer partidosPerdidos;
    private Integer golesAFavor;
    private Integer golesEnContra;
    private Integer diferenciaDeGoles;
    private Integer puntos;

}
