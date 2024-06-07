package persistencia;

import clases.TorneoCounter;
import clases.TorneoMoba;
import clases.TorneoValorant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PersistenciaTorneo {

    private String path = "src/persistencia/archivosTxt/torneoGuardados.txt";
    Operaciones operaciones = new Operaciones();

    public ArrayList<String[]> recuperarTorneos(String juego) {
        return  operaciones.recuperarRegistros(path, juego);
    }

    public String[] recuperarTorneo(String nombre) {
        return operaciones.recuperarRegistro(path, nombre);
    }

    public void borrarTorneo(String objetivo) {
        operaciones.borrarRegistro(path, objetivo);
    }

    public void guardarTorneo(TorneoValorant torneo) {
        operaciones.agregarRegistro(path,
                torneo.getNombre() + ";" +
                        torneo.getOrganizador() + ";" +
                        torneo.getVideojuego() + ";" +
                        torneo.getCupos() + ";" +
                        torneo.getFecha() + ";" +
                        torneo.getDescripcion() + ";" +
                        torneo.getPremios() + ";" +
                        torneo.getBajasTotales() + ";" +
                        torneo.getRondasTotales() + ";" +
                        torneo.getArmarMasPopular() + ";" +
                        torneo.getChampMasPickeado()
        );
    }
    public void guardarTorneo(TorneoCounter torneo) {
        operaciones.agregarRegistro(path,
                torneo.getNombre() + ";" +
                        torneo.getOrganizador() + ";" +
                        torneo.getVideojuego() + ";" +
                        torneo.getCupos() + ";" +
                        torneo.getFecha() + ";" +
                        torneo.getDescripcion() + ";" +
                        torneo.getPremios() + ";" +
                        torneo.getBajasTotales() + ";" +
                        torneo.getRondasTotales() + ";" +
                        torneo.getArmarMasPopular() + ";" +
                        torneo.getMuertesPorFuegoAmigo()
        );
    }
    public void guardarTorneo(TorneoMoba torneo) {
        operaciones.agregarRegistro(path,
                torneo.getNombre() + ";" +
                        torneo.getOrganizador() + ";" +
                        torneo.getVideojuego() + ";" +
                        torneo.getCupos() + ";" +
                        torneo.getFecha() + ";" +
                        torneo.getDescripcion() + ";" +
                        torneo.getPremios() + ";" +
                        torneo.getOroTotal() + ";" +
                        torneo.getTorretasDestruidas() + ";" +
                        torneo.getInhibidoresDestruidos()
        );
    }

    public void actualizarTorneo(TorneoCounter torneo) {

        operaciones.actualizarRegistro(path, String.valueOf(torneo.getNombre()), (
                torneo.getNombre() + ";" +
                torneo.getOrganizador() + ";" +
                torneo.getVideojuego() + ";" +
                torneo.getCupos() + ";" +
                torneo.getFecha()) + ";" +
                torneo.getDescripcion() + ";" +
                torneo.getPremios() + ";" +
                torneo.getBajasTotales() + ";" +
                torneo.getRondasTotales() + ";" +
                torneo.getArmarMasPopular() + ";" +
                torneo.getMuertesPorFuegoAmigo());
    }

    public void actualizarTorneo(TorneoValorant torneo) {

        operaciones.actualizarRegistro(path, String.valueOf(torneo.getNombre()), (
                torneo.getNombre() + ";" +
                torneo.getOrganizador() + ";" +
                torneo.getVideojuego() + ";" +
                torneo.getCupos() + ";" +
                torneo.getFecha()) + ";" +
                torneo.getDescripcion() + ";" +
                torneo.getPremios() + ";" +
                torneo.getBajasTotales() + ";" +
                torneo.getRondasTotales() + ";" +
                torneo.getArmarMasPopular() + ";" +
                torneo.getChampMasPickeado());

    }

    public void actualizarTorneo(TorneoMoba torneo) {

        operaciones.actualizarRegistro(path, String.valueOf(torneo.getNombre()), (
                torneo.getNombre() + ";" +
                torneo.getOrganizador() + ";" +
                torneo.getVideojuego() + ";" +
                torneo.getCupos() + ";" +
                torneo.getFecha()) + ";" +
                torneo.getDescripcion() + ";" +
                torneo.getPremios() + ";" +
                torneo.getOroTotal() + ";" +
                torneo.getTorretasDestruidas() + ";" +
                torneo.getInhibidoresDestruidos());

    }
}
