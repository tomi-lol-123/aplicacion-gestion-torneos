package persistencia;

import clases.*;

public class PersistenciaEquipo {

    public PersistenciaEquipo(Equipo equipo) {
        System.out.println("Persistencia parte 1: " + equipo.getNombre());

        Operaciones operaciones = new Operaciones();

        operaciones.creararchivo("src/persistencia/archivosTxt/equiposGuardados.txt");

        operaciones.escribirarchivo("src/persistencia/archivosTxt/equiposGuardados.txt","Torneo1 Nombre: " + equipo.getNombre());

        System.out.println("Persistencia parte 2: " + equipo.getNombre());

        operaciones.devolvervalores("ResultadoTorneo.txt", 19);

        System.out.println("Persistencia parte 3: " + equipo.getNombre());

    }
}
