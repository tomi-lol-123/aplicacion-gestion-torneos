package clases;

import java.util.Date;

public abstract class Torneo {

    protected String nombre;

    protected String organizador;

    protected String videojuego;

    protected int cupos;

    protected Date fecha;

    protected String[] reglas;

    protected String premios;

    protected String[] bracket;

    protected Equipo[] Equipo;

    public Torneo() {
    }

    public Torneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String[] reglas, String premios, String[] bracket) {
        this.nombre = nombre;
        this.organizador = organizador;
        this.videojuego = videojuego;
        this.cupos = cupos;
        this.fecha = fecha;
        this.reglas = reglas;
        this.premios = premios;
        this.bracket = bracket;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getOrganizador() { return organizador; }

    public void setOrganizador(String organizador) { this.organizador = organizador; }

    public String getVideojuego() { return videojuego; }

    public void setVideojuego(String videojuego) { this.videojuego = videojuego; }

    public int getCupos() { return cupos; }

    public void setCupos(int cupos) { this.cupos = cupos; }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String[] getReglas() { return reglas; }

    public void setReglas(String[] reglas) { this.reglas = reglas; }

    public String getPremios() { return premios; }

    public void setPremios(String premios) { this.premios = premios; }

    public String[] getBracket() { return bracket; }

    public void setBracket(String[] bracket) { this.bracket = bracket; }
}
