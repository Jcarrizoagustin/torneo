package com.example.torneo.model.fixture;



import com.example.torneo.model.Equipo;
import com.example.torneo.model.FechaTorneo;

import java.util.List;

public interface Fixture {
    List<FechaTorneo> crearFixture(List<Equipo> equipos);

}
