package control;

import clases.TorneoCounter;
import clases.TorneoMoba;
import clases.TorneoValorant;
import persistencia.PersistenciaTorneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControlTorneoMoba{

    PersistenciaTorneo persistencia = new PersistenciaTorneo();

    public ArrayList<TorneoMoba> recuperarTorneos(String juego) throws ParseException {
        ArrayList<TorneoMoba> torneos = new ArrayList<TorneoMoba>();

        for (String[] torneo : persistencia.recuperarTorneos(juego)) {
            torneos.add(new TorneoMoba(
                    torneo[0],
                    torneo[1],
                    torneo[2],
                    Integer.parseInt(torneo[3]),
                    new SimpleDateFormat("DD-MM-YYYY").parse(torneo[4]),
                    torneo[5],
                    torneo[6],
                    Integer.parseInt(torneo[7]),
                    Integer.parseInt(torneo[8]),
                    Integer.parseInt(torneo[9]),
                    torneo[10]
            ));
        }

        return torneos;
    }

    public void crearTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, String objetivoMasCapturados) {
        persistencia.guardarTorneo(new TorneoMoba(
                nombre,
                organizador,
                videojuego,
                cupos,
                fecha,
                descripcion,
                premios,
                oroTotal,
                torretasDestruidas,
                inhibidoresDestruidos,
                objetivoMasCapturados
        ));
    }

    public TorneoMoba recuperarTorneo(String nombre) throws ParseException {
        String[] datos = persistencia.recuperarTorneo(nombre);
        return new TorneoMoba(
                datos[0],
                datos[1],
                datos[2],
                Integer.valueOf(datos[3]),
                new SimpleDateFormat("DD-MM-YYYY").parse(datos[4]),
                datos[5],
                datos[6],
                Integer.valueOf(datos[7]),
                Integer.valueOf(datos[8]),
                Integer.valueOf(datos[9]),
                datos[10]
        );
    }

    public void actualizarTorneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, String objetivoMasCapturados) {
        persistencia.actualizarTorneo(new TorneoMoba(
                nombre,
                organizador,
                videojuego,
                cupos,
                fecha,
                descripcion,
                premios,
                oroTotal,
                torretasDestruidas,
                inhibidoresDestruidos,
                objetivoMasCapturados
                )
        );
    }

}
