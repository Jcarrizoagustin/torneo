package com.example.torneo.utils.comparators;

import com.example.torneo.model.EstadisticaJugador;

import java.util.Comparator;

public class EstadisticaJugadorAmarillas implements Comparator<EstadisticaJugador> {
    @Override
    public int compare(EstadisticaJugador o1, EstadisticaJugador o2) {
        return o1.getTarjetasAmarillas() - o2.getTarjetasAmarillas();
    }
}
