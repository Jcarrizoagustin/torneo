package com.example.torneo.model.fixture;

import com.example.torneo.model.Equipo;
import com.example.torneo.model.FechaTorneo;
import com.example.torneo.model.Partido;
import com.example.torneo.model.Torneo;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Data
public class FixtureRondaUnica implements Fixture{

    private Torneo torneo;
    private List<FechaTorneo> fechas = new ArrayList();

    @Override
    public List<FechaTorneo> crearFixture(List<Equipo> equipos) {
        int cantidadEquipos = equipos.size();
        if(!(cantidadEquipos % 2 == 0)){
            //Si la cantidad de equipos no es par, entonces cada fecha habra un equipo libre
            //Esto lo solucionamos agregando un equipo a la lista para hacerlo par
            //entonces al equipo que le toque jugar contra este equipo libre es el que
            //quedara libre en esa fecha.
            Equipo equipoLibre = new Equipo("Libre");
            equipos.add(equipoLibre);
            cantidadEquipos++;
        }
        //Desordenamos la lista para una mayor aleatoriedad en las fechas
        Collections.shuffle(equipos);
        Equipo equipoFijo = equipos.get(0);
        equipos.remove(0);
        //Cantidad de iteraciones para la sublista
        //Representa la cantidad de partidos ademas del partido del equipo fijo
        int cantidad = (cantidadEquipos -2) / 2;
        for(int i = 1;i<cantidadEquipos;i++){
            //Cada iteracion representa una fecha
            FechaTorneo fechaTorneo = new FechaTorneo(i);
            //Utilizamos la condicion de par o impar del contador para
            //asegurarnos que el equipo fijo no juegue de local siempre
            if(i%2==0){
                Partido partidoEquipoFijo = new Partido(equipoFijo,equipos.get(0));
                fechaTorneo.agregarPartido(partidoEquipoFijo);
            }else{
                Partido partidoEquipoFijo = new Partido(equipos.get(0),equipoFijo);
                fechaTorneo.agregarPartido(partidoEquipoFijo);
            }
            int contador = cantidadEquipos-2;
            for(int j = 1;j<=cantidad;j++ ){
                Equipo local = equipos.get(j);
                Equipo visitante = equipos.get(contador);
                //Utilizamos la condicion de par o impar del contador para
                //asegurarnos que los equipos de la sublista jueguen alternadamente
                //de local y visitante.
                if(i%2==0){
                    Partido partido = new Partido(local,visitante);
                    fechaTorneo.agregarPartido(partido);
                }else{
                    Partido partido = new Partido(visitante,local);
                    fechaTorneo.agregarPartido(partido);
                }
                contador--;
            }
            fechas.add(fechaTorneo);
            Collections.rotate(equipos,1);
        }
        return null;
    }


    @Override
    public String toString(){
        String fixtureString = "Fixture **** ";
        for(FechaTorneo fechaTorneo : fechas){
            fixtureString += fechaTorneo.toString();
        }
        return fixtureString;

    }

}
