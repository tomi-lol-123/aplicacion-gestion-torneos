package clases;

import java.util.Date;

public abstract  class TorneoFps extends Torneo{

    protected int  bajasTotales;

    protected  int rondasTotales;

    protected String armarMasPopular;

    public TorneoFps() {
    }

    public TorneoFps(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int bajasTotales, int rondasTotales, String armarMasPopular) {
        super(nombre, organizador, videojuego, cupos, fecha, descripcion, premios);
        this.bajasTotales = bajasTotales;
        this.rondasTotales = rondasTotales;
        this.armarMasPopular = armarMasPopular;
    }

    public int getBajasTotales() {
        return bajasTotales;
    }

    public void setBajasTotales(int bajasTotales) {
        this.bajasTotales = bajasTotales;
    }

    public int getRondasTotales() {
        return rondasTotales;
    }

    public void setRondasTotales(int rondasTotales) {
        this.rondasTotales = rondasTotales;
    }

    public String getArmarMasPopular() {
        return armarMasPopular;
    }

    public void setArmarMasPopular(String armarMasPopular) {
        this.armarMasPopular = armarMasPopular;
    }
}


