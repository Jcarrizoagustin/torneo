package com.example.torneo.model;

import lombok.Data;

@Data
public class Expulsion {
    private Jugador jugador;
    private Integer cantidadDeFechas;
    private String detalle;
}
