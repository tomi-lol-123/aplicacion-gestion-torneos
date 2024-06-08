package persistencia;

import clases.*;

public class PersistenciaEquipo {

    private static final String PATH = "src/persistencia/archivosTxt/equiposGuardados.txt";
    Operaciones operaciones = new Operaciones();

    public void guardarEquipo(Equipo equipo) {
        System.out.println("Persistencia parte 1: " + equipo.getNombre());

        operaciones.agregarRegistro(PATH,
                equipo.getIdEquipo() + ";" +
                        equipo.getNombre() + ";" +
                        equipo.getResponsable() + ";" +
                        equipo.getVictorias() + ";" +
                        equipo.getDerrotas()
        );
    }

    public String[] recuperarEquipo(String objetivo) {
        return operaciones.recuperarRegistro(PATH, objetivo);
    }

    public void actualizarEquipo(Equipo equipo) {

        operaciones.actualizarRegistro(PATH, String.valueOf(equipo.getIdEquipo()),
                equipo.getIdEquipo() + ";" +
                        equipo.getNombre() + ";" +
                        equipo.getResponsable() + ";" +
                        equipo.getVictorias() + ";" +
                        equipo.getDerrotas());
    }

    public void borrarEquipo(String objetivo) {
        operaciones.borrarRegistro(PATH, objetivo);
    }
}
