package clases;

import java.util.Date;

public class TorneoValorant extends TorneoFps {

    private String champMasPickeado;

    public TorneoValorant() {
    }

    public TorneoValorant(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular, String champMasPickeado) {
        super(nombre, organizador, videojuego, cupos, fecha, descripcion, premios, bajasTotales, rondasTotales, armarMasPopular);
        this.champMasPickeado = champMasPickeado;
    }

    public String getChampMasPickeado() {
        return champMasPickeado;
    }

    public void setChampMasPickeado(String champMasPickeado) {
        this.champMasPickeado = champMasPickeado;
    }
}
