package control;

import clases.Equipo;
import clases.TorneoCounter;
import persistencia.PersistenciaEquipo;
import persistencia.PersistenciaTorneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControlEquipo {

    PersistenciaEquipo persistencia = new PersistenciaEquipo();

    public void crearEquipo(int idEquipo, String nombre, String responsable, int victorias, int derrotas) {
        persistencia.guardarEquipo(new Equipo(
                idEquipo,
                nombre,
                responsable,
                victorias,
                derrotas
        ));
    }

    public Equipo recuperarEquipo(String idEquipo) {
        String[] datos = persistencia.recuperarEquipo(idEquipo);
        return new Equipo(
                Integer.valueOf(datos[0]),
                datos[1],
                datos[2],
                Integer.valueOf(datos[3]),
                Integer.valueOf(datos[3])
        );
    }

    public void actualizarEquipo(int idEquipo, String nombre, String responsable, int victorias, int derrotas) {
        persistencia.actualizarEquipo(new Equipo(
                idEquipo,
                nombre,
                responsable,
                victorias,
                derrotas
        ));
    }

    public void borrarEquipo(String idEquipo) {
        persistencia.borrarEquipo(idEquipo);
    }

}
