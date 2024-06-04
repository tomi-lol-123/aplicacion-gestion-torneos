package clases;

import java.util.Date;

public class TorneoLol extends TorneoMoba{

    private int baronesAsesinados;

    private int dragonesAsesinados;

    public TorneoLol() {
    }

    public TorneoLol(String nombre, String organizador, String videojuego, int cupos, Date fecha, String[] reglas, String premios, String[] bracket, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, int baronesAsesinados, int dragonesAsesinados) {
        super(nombre, organizador, videojuego, cupos, fecha, reglas, premios, bracket, oroTotal, torretasDestruidas, inhibidoresDestruidos);
        this.baronesAsesinados = baronesAsesinados;
        this.dragonesAsesinados = dragonesAsesinados;
    }

    public int getBaronesAsesinados() { return baronesAsesinados; }

    public void setBaronesAsesinados(int baronesAsesinados) { this.baronesAsesinados = baronesAsesinados; }

    public int getDragonesAsesinados() { return dragonesAsesinados; }

    public void setDragonesAsesinados(int dragonesAsesinados) { this.dragonesAsesinados = dragonesAsesinados; }
}
