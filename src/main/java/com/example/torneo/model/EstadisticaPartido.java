package com.example.torneo.model;

import lombok.Data;

import java.util.List;
@Data
public class EstadisticaPartido {
    private Partido partido;
    private Integer golesEquipoLocal;
    private Integer golesEquipoVisitante;
    private List<Jugador> jugadoresAmonestados;
    private List<Amonestacion> jugadoresExpulsados;
}
