package control;

import clases.Equipo;
import persistencia.PersistenciaEquipo;

public class ControlEquipo {

    public ControlEquipo(int idEquipo, String nombre, String responsable, int victorias, int derrotas) {

        Equipo nuevoEquipo = new Equipo(idEquipo, nombre, responsable, victorias, derrotas);
        System.out.println("Control parte 1: " + nuevoEquipo.getNombre());

        PersistenciaEquipo guardarEquipo = new PersistenciaEquipo(nuevoEquipo);
        System.out.println("Control parte 2: " + nuevoEquipo.getNombre());

    }
}
