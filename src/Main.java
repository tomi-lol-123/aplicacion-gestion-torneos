import clases.Equipo;
import clases.Jugador;
import clases.Torneo;
import gui.CrearJugador;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {

//        devolve la clase abstracta a torneo

        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        Equipo equipo3 = new Equipo();
        Equipo equipo4 = new Equipo();
        Equipo equipo5 = new Equipo();
        Equipo equipo6 = new Equipo();

        equipo1.setNombre("Equipo1");
        equipo2.setNombre("Equipo2");
        equipo3.setNombre("Equipo3");
        equipo4.setNombre("Equipo4");
        equipo5.setNombre("Equipo5");
        equipo6.setNombre("Equipo6");

        Equipo[] listaEquiposs = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6};
        String[] reglass = {"NO HAY REGLAS"};

//        Torneo torneo = new Torneo("vct", "Riot", "Valorant", 6, new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015"), reglass, "1000 usd", listaEquiposs);
    }
}