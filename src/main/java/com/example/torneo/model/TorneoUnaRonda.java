package com.example.torneo.model;

import com.example.torneo.model.fixture.Fixture;
import com.example.torneo.model.fixture.FixtureRondaUnica;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class TorneoUnaRonda implements Torneo{
    private String nombre;
    private List<Equipo> equipos;
    private Fixture fixture;

    public TorneoUnaRonda(String nombre){
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.fixture = new FixtureRondaUnica();
    }
    @Override
    public void agregarEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }
    @Override
    public void generarFixture(){
        this.fixture.crearFixture(this.equipos);
    }
}
