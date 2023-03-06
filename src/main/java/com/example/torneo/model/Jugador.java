package com.example.torneo.model;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Jugador {
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fechaDeNacimiento;
    private Equipo equipo;
    private Boolean estaSuspendido = false;
}
