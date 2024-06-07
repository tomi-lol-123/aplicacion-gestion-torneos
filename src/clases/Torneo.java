package clases;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public abstract class Torneo {

    protected String nombre;

    protected String organizador;

    protected String videojuego;

    protected int cupos;

    protected Date fecha;

    protected String descripcion;

    protected String premios;

    protected Equipo[][] bracket;

    protected Equipo[] equipos;

    public Torneo() {
    }

    public Torneo(String nombre, String organizador, String videojuego, int cupos, Date fecha, String descripcion, String premios) {
        this.nombre = nombre;
        this.organizador = organizador;
        this.videojuego = videojuego;
        this.cupos = cupos;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.premios = premios;
//        this.bracket = mezclarBracket(equipos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public Equipo[][] getBracket() {
        return bracket;
    }

    public void setBracket(Equipo[][] bracket) {
        this.bracket = bracket;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    private Equipo[][] mezclarBracket(Equipo[] listaEquipos) {

        Equipo[] lista = listaEquipos;
        Equipo[][] bracketArmado = new Equipo[lista.length / 2][2];
        int x = 0;
        List<Equipo> listaEquipo = Arrays.asList(lista);
        Collections.shuffle(listaEquipo);

        for (int i = 0; i < listaEquipos.length; i++){

            bracketArmado[x][i%2] = listaEquipos[i];
            if (i % 2 == 1) {
                x++;
            }
        }

        System.out.println('[');
        System.out.print("  [" + bracketArmado[0][0].getNombre() + ", ");
        System.out.println(bracketArmado[0][1].getNombre() + "]");
        System.out.print("  [" + bracketArmado[1][0].getNombre() + ", ");
        System.out.println(bracketArmado[1][1].getNombre() + "]");
        System.out.print("  [" + bracketArmado[2][0].getNombre() + ", ");
        System.out.println(bracketArmado[2][1].getNombre() + "]");
        System.out.println(']');


        return bracketArmado;

    }
}

//String[] listaEquipos = {"1", "2", "3", "4", "5", "6"};
//String[][] brackets = new String[listaEquipos.length / 2][2];
//int x = 0;
//List<String> listaEquipo = Arrays.asList(listaEquipos);
//        Collections.shuffle(listaEquipo);
//
//        for (int i = 0; i < listaEquipos.length; i++){
//
//brackets[x][i%2] = listaEquipos[i];
//        if (i % 2 == 1) {
//x++;
//        }
//        }
//
//        System.out.println(Arrays.toString(brackets[0]));
//        System.out.println(Arrays.toString(brackets[1]));
//        System.out.println(Arrays.toString(brackets[2]));
//        }