package com.example.torneo.utils.comparators;

import com.example.torneo.model.EstadisticaEquipo;

import java.util.Comparator;

/**
 * Clase comparadora de estadisticas de equipos para elaborar la tabla de posiciones.
 * El criterio para determinar las posiciones son:
 * 1.Puntos.
 * 2.Diferencia de gol a favor.
 * 3.Goles a favor.
 */
public class CompararEstadisticasEquipos implements Comparator<EstadisticaEquipo> {
    //Esta clase se utiliza Collections.sort(listaAOrdenar,new CompararEstadisticasEquipos());
    @Override
    public int compare(EstadisticaEquipo o1, EstadisticaEquipo o2) {
        if(o1.getPuntos().equals(o2.getPuntos())){
            if(o1.getDiferenciaDeGoles().equals(o2.getDiferenciaDeGoles())){
                return o1.getGolesAFavor() - o2.getGolesAFavor();
            }
            return o1.getDiferenciaDeGoles() - o2.getDiferenciaDeGoles();
        }
        return o1.getPuntos() - o2.getPuntos();
    }
}
