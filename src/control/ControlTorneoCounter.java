package control;

import clases.Equipo;
import clases.TorneoCounter;
import clases.TorneoValorant;
import persistencia.PersistenciaTorneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControlTorneoCounter{

    PersistenciaTorneo persistencia = new PersistenciaTorneo();

    public ArrayList<TorneoCounter> recuperarTorneos(String juego) throws ParseException {
        ArrayList<TorneoCounter> torneos = new ArrayList<TorneoCounter>();

        for (String[] torneo : persistencia.recuperarTorneos(juego)) {
            torneos.add(new TorneoCounter(
                    torneo[0],
                    torneo[1],
                    torneo[2],
                    Integer.valueOf(torneo[3]),
                    new SimpleDateFormat("DD-MM-YYYY").parse(torneo[4]),
                    torneo[5],
                    torneo[6],
                    Integer.valueOf(torneo[7]),
                    Integer.valueOf(torneo[8]),
                    torneo[9],
                    Integer.valueOf(torneo[10])
            ));
        }

        return torneos;
    }

    public void crearTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular, int muertesPorFuegoAmigo) {
        persistencia.guardarTorneo(new TorneoCounter(nombre, organizador, videojuego, cupos, fecha, descripcion, premios, bajasTotales, rondasTotales, armarMasPopular, muertesPorFuegoAmigo));
    }

    public TorneoCounter recuperarTorneo(String nombre) throws ParseException {
        String[] datos = persistencia.recuperarTorneo(nombre);
        return new TorneoCounter(
                datos[0],
                datos[1],
                datos[2],
                Integer.valueOf(datos[3]),
                new SimpleDateFormat("DD-MM-YYYY").parse(datos[4]),
                datos[5],
                datos[6],
                Integer.valueOf(datos[7]),
                Integer.valueOf(datos[8]),
                datos[9],
                Integer.valueOf(datos[10])
        );
    }

    public void actualizarTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular, int muertesPorFuegoAmigo) {
        persistencia.actualizarTorneo(new TorneoCounter(
                nombre,
                organizador,
                videojuego,
                cupos,
                fecha,
                descripcion,
                premios,
                bajasTotales,
                rondasTotales,
                armarMasPopular,
                muertesPorFuegoAmigo
                )
        );
    }

    public void borrarTorneo(String nombre) {
        persistencia.borrarTorneo(nombre);
    }

}
