package clases;

import java.util.Date;

public class TorneoLol extends TorneoMoba{

    private int dragonesAsesinados;

    public TorneoLol() {
    }

    public TorneoLol(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, int dragonesAsesinados) {
        super(nombre, organizador, videojuego, cupos, fecha, descripcion, premios, oroTotal, torretasDestruidas, inhibidoresDestruidos);
        this.dragonesAsesinados = dragonesAsesinados;
    }

    public int getDragonesAsesinados() { return dragonesAsesinados; }

    public void setDragonesAsesinados(int dragonesAsesinados) { this.dragonesAsesinados = dragonesAsesinados; }
}
