package control;

import clases.TorneoCounter;
import clases.TorneoValorant;
import persistencia.PersistenciaTorneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControlTorneoValorant {

    PersistenciaTorneo persistencia = new PersistenciaTorneo();

    public ArrayList<TorneoValorant> recuperarTorneos(String juego) throws ParseException {
        ArrayList<TorneoValorant> torneos = new ArrayList<TorneoValorant>();

        for (String[] torneo : persistencia.recuperarTorneos(juego)) {
            torneos.add(new TorneoValorant(
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
                    torneo[10]
            ));
        }

        return torneos;
    }
    public void crearTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular, String champMasPickeado) {
        persistencia.guardarTorneo(new TorneoValorant(nombre, organizador, videojuego, cupos, fecha, descripcion, premios, bajasTotales, rondasTotales, armarMasPopular, champMasPickeado));
    }

    public TorneoValorant recuperarTorneo(String nombre) throws ParseException {
        String[] datos = persistencia.recuperarTorneo(nombre);
        return new TorneoValorant(
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
                datos[10]
        );
    }

    public void actualizarTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular, String champMasPickeado) {
        persistencia.actualizarTorneo(new TorneoValorant(
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
                        champMasPickeado
                )
        );
    }

}