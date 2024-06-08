package persistencia;

import clases.TorneoCounter;
import clases.TorneoMoba;
import clases.TorneoValorant;

import java.util.ArrayList;

public class PersistenciaTorneo {

    private static final String PATH = "src/persistencia/archivosTxt/torneoGuardados.txt";
    Operaciones operaciones = new Operaciones();

    public ArrayList<String[]> recuperarTorneos(String juego) {
        return  operaciones.recuperarRegistros(PATH, juego);
    }

    public String[] recuperarTorneo(String nombre) {
        return operaciones.recuperarRegistro(PATH, nombre);
    }

    public void borrarTorneo(String objetivo) {
        operaciones.borrarRegistro(PATH, objetivo);
    }

    public void guardarTorneo(TorneoValorant torneo) {
        operaciones.agregarRegistro(PATH,
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
        operaciones.agregarRegistro(PATH,
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
        operaciones.agregarRegistro(PATH,
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

        operaciones.actualizarRegistro(PATH, String.valueOf(torneo.getNombre()), (
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

        operaciones.actualizarRegistro(PATH, String.valueOf(torneo.getNombre()), (
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

        operaciones.actualizarRegistro(PATH, String.valueOf(torneo.getNombre()), (
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
