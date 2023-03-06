package com.example.torneo.model.fixture;

import com.example.torneo.model.Equipo;
import com.example.torneo.model.FechaTorneo;
import com.example.torneo.model.Partido;
import com.example.torneo.model.Torneo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class FixtureRondaUnica implements Fixture{

    private Torneo torneo;
    private List<FechaTorneo> fechas = new ArrayList();

    @Override
    public List<FechaTorneo> crearFixture(List<Equipo> equipos) {
        return null;
    }
}
