package clases;

public class Equipo {

    private int idEquipo;

    private String nombre;

    private String responsable;

    private int victorias;

    private int derrotas;

    public Equipo() {}

    public Equipo(int idEquipo, String nombre, String responsable, int victorias, int derrotas) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.responsable = responsable;
        this.victorias = victorias;
        this.derrotas = derrotas;
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
}
