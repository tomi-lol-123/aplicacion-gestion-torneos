package clases;

import java.util.Date;

public abstract class TorneoMoba extends Torneo {

    protected int oroTotal;

    protected int torretasDestruidas;

    protected int inhibidoresDestruidos;

    public TorneoMoba() {
    }

    public TorneoMoba(String nombre, String organizador, String videojuego, int cupos, Date fecha, String[] reglas, String premios, String[] bracket, int oroTotal, int torretasDestruidas, int inhibidoresDestruidos) {
        super(nombre, organizador, videojuego, cupos, fecha, reglas, premios, bracket);
        this.oroTotal = oroTotal;
        this.torretasDestruidas = torretasDestruidas;
        this.inhibidoresDestruidos = inhibidoresDestruidos;
    }

    public int getOroTotal() { return oroTotal; }

    public void setOroTotal(int oroTotal) { this.oroTotal = oroTotal; }

    public int getTorretasDestruidas() { return torretasDestruidas; }

    public void setTorretasDestruidas(int torretasDestruidas) { this.torretasDestruidas = torretasDestruidas; }

    public int getInhibidoresDestruidos() { return inhibidoresDestruidos; }

    public void setInhibidoresDestruidos(int inhibidoresDestruidos) { this.inhibidoresDestruidos = inhibidoresDestruidos; }
}
