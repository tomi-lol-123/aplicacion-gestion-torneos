package persistencia;

import clases.*;

public class PersistenciaEquipo {

    private String path = "src/persistencia/archivosTxt/equiposGuardados.txt";
    Operaciones operaciones = new Operaciones();

    public void guardarEquipo(Equipo equipo) {
        System.out.println("Persistencia parte 1: " + equipo.getNombre());

        operaciones.agregarRegistro(path,
                equipo.getIdEquipo() + ";" +
                        equipo.getNombre() + ";" +
                        equipo.getResponsable() + ";" +
                        equipo.getVictorias() + ";" +
                        equipo.getDerrotas()
        );
    }

    public String[] recuperarEquipo(String objetivo) {
        return operaciones.recuperarRegistro(path, objetivo);
    }

    public void actualizarEquipo(Equipo equipo) {

        operaciones.actualizarRegistro(path, String.valueOf(equipo.getIdEquipo()),
                equipo.getIdEquipo() + ";" +
                        equipo.getNombre() + ";" +
                        equipo.getResponsable() + ";" +
                        equipo.getVictorias() + ";" +
                        equipo.getDerrotas());
    }

    public void borrarEquipo(String objetivo) {
        operaciones.borrarRegistro(path, objetivo);
    }
}
