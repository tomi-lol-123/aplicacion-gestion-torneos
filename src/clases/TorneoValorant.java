package clases;

import java.util.Date;

public class TorneoValorant extends TorneoFps {

    private String champMasPickeado;

    public TorneoValorant() {
    }

    public TorneoValorant(String nombre, String organizador, String videojuego, int cupos, Date fecha, String[] reglas, String premios, String[] bracket, int bajasTotales, int rondasTotales, String armarMasPopular, String champMasPickeado) {
        super(nombre, organizador, videojuego, cupos, fecha, reglas, premios, bracket, bajasTotales, rondasTotales, armarMasPopular);
        this.champMasPickeado = champMasPickeado;
    }

    public String getChampMasPickeado() {
        return champMasPickeado;
    }

    public void setChampMasPickeado(String champMasPickeado) {
        this.champMasPickeado = champMasPickeado;
    }
}
