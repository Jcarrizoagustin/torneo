package com.example.torneo.utils.comparators;

import com.example.torneo.model.EstadisticaJugador;

import java.util.Comparator;

public class EstadisticaJugadorRojas implements Comparator<EstadisticaJugador> {
    @Override
    public int compare(EstadisticaJugador o1, EstadisticaJugador o2) {
        return o1.getTarjetasRojas() - o2.getTarjetasRojas();
    }
}
