package clases;

import java.util.Date;

public class TorneoDota extends TorneoMoba {

    private int roshanAsesinados;

    public TorneoDota() {
    }

    public TorneoDota(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, int roshanAsesinados) {
        super(nombre, organizador, videojuego, cupos, fecha, descripcion, premios, oroTotal, torretasDestruidas, inhibidoresDestruidos);
        this.roshanAsesinados = roshanAsesinados;
    }

    public int getRoshanAsesinados() { return roshanAsesinados; }

    public void setRoshanAsesinados(int roshanAsesinados) { this.roshanAsesinados = roshanAsesinados; }
}
