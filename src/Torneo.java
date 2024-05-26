import java.time.LocalDate;

public class Torneo {
    private String nombre;
    private int id;
    private String juego;
    private String region;
    private LocalDate fecha;
    private float premio;
    private String lugar;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getJuego() {
        return juego;
    }

    public String getRegion() {
        return region;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getPremio() {
        return premio;
    }

    public String getLugar() {
        return lugar;
    }
}
