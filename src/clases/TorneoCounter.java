package clases;

import java.util.Date;

public class TorneoCounter extends TorneoFps {

    private int muertesPorFuegoAmigo;

    public TorneoCounter() {
    }

    public TorneoCounter(String nombre, String organizador, String videojuego, int cupos, Date fecha, String[] reglas, String premios, String[] bracket, int bajasTotales, int rondasTotales, String armarMasPopular, int muertesPorFuegoAmigo) {
        super(nombre, organizador, videojuego, cupos, fecha, reglas, premios, bracket, bajasTotales, rondasTotales, armarMasPopular);
        this.muertesPorFuegoAmigo = muertesPorFuegoAmigo;
    }

    public int getMuertesPorFuegoAmigo() {
        return muertesPorFuegoAmigo;
    }

    public void setMuertesPorFuegoAmigo(int muertesPorFuegoAmigo) {
        this.muertesPorFuegoAmigo = muertesPorFuegoAmigo;
    }
}

