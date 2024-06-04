package clases;

import java.util.Arrays;

public class Equipo {

    private int idEquipo;

    private String nombre;

    private String responsable;

    private int victorias;

    private int derrotas;

    private Jugador[] jugador;

    public Equipo() {}

    public Equipo(int idEquipo, String nombre, String responsable, int victorias, int derrotas, Jugador[] jugador) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.responsable = responsable;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.jugador = jugador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public Jugador[] getJugador() { return jugador; }

    public void setJugador(Jugador[] jugador) { this.jugador = jugador; }


    public String imprimir() {
        String resultado = "";
        resultado += "Nombre del equipo = " + nombre + "\n";
        resultado += "Responsable = " + responsable + "\n";
        resultado += "Victorias = " + victorias + "\n";
        resultado += "Derotas " + derrotas + "\n";
        resultado += "Jugadores\n";
        for (int i = 0; i < jugador.length; i++) {
            resultado += jugador[i] + "\n";
        }

        return resultado;
    }
}
