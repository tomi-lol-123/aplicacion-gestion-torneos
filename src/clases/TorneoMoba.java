package clases;

import java.util.Date;

public class TorneoMoba extends Torneo {

    private int oroTotal;

    private int torretasDestruidas;

    private int inhibidoresDestruidos;

    private String objetivoMasCapturados;

    public TorneoMoba() {
    }

    public TorneoMoba(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos, String objetivoMasCapturados) {
        super(nombre, organizador, videojuego, cupos, fecha, descripcion, premios);
        this.oroTotal = oroTotal;
        this.torretasDestruidas = torretasDestruidas;
        this.inhibidoresDestruidos = inhibidoresDestruidos;
        this.objetivoMasCapturados = objetivoMasCapturados;
    }

    public int getOroTotal() { return oroTotal; }

    public void setOroTotal(int oroTotal) { this.oroTotal = oroTotal; }

    public int getTorretasDestruidas() { return torretasDestruidas; }

    public void setTorretasDestruidas(int torretasDestruidas) { this.torretasDestruidas = torretasDestruidas; }

    public int getInhibidoresDestruidos() { return inhibidoresDestruidos; }

    public void setInhibidoresDestruidos(int inhibidoresDestruidos) { this.inhibidoresDestruidos = inhibidoresDestruidos; }

    public String getObjetivoMasCapturados() {
        return objetivoMasCapturados;
    }

    public void setObjetivoMasCapturados(String objetivoMasCapturados) {
        this.objetivoMasCapturados = objetivoMasCapturados;
    }
}
