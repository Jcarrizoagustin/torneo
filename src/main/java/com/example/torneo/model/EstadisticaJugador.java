package com.example.torneo.model;

import lombok.Data;

@Data
public class EstadisticaJugador {
    private Jugador jugador;
    private Integer goles;
    private Integer asistencias;
    private Integer tarjetasAmarillas;
    private Integer tarjetasRojas;


}
