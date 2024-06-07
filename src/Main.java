import clases.Equipo;
import clases.Jugador;
import clases.Torneo;
import gui.*;
import gui.Equipo.*;
import gui.Torneo.SwingBuscarTorneo;
import gui.Torneo.SwingCrearTorneo;
import gui.Torneo.SwingMenuTorneo;


import javax.swing.*;
import java.awt.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {

//        devolve la clase abstracta a torneo

//        Equipo equipo1 = new Equipo();
//        Equipo equipo2 = new Equipo();
//        Equipo equipo3 = new Equipo();
//        Equipo equipo4 = new Equipo();
//        Equipo equipo5 = new Equipo();
//        Equipo equipo6 = new Equipo();
//
//        equipo1.setNombre("Equipo1");
//        equipo2.setNombre("Equipo2");
//        equipo3.setNombre("Equipo3");
//        equipo4.setNombre("Equipo4");
//        equipo5.setNombre("Equipo5");
//        equipo6.setNombre("Equipo6");
//
//        Equipo[] listaEquiposs = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6};
//        String[] reglass = {"NO HAY REGLAS"};

//        Torneo torneo = new Torneo("vct", "Riot", "Valorant", 6, new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015"), reglass, "1000 usd", listaEquiposs);

        JFrame ventana = new JFrame("Gestion de Torneos");
        CardLayout cardLayout = new CardLayout();
        JPanel panel = new JPanel(cardLayout);

        gui.SwingMenuPrincipal SMP = new gui.SwingMenuPrincipal(ventana,cardLayout,panel);
        gui.Equipo.SwingMenuEquipo SME = new gui.Equipo.SwingMenuEquipo(cardLayout,panel);
        gui.Torneo.SwingMenuTorneo SMT = new gui.Torneo.SwingMenuTorneo(cardLayout,panel);
        gui.Eventos SE = new gui.Eventos(cardLayout,panel);

        gui.Torneo.SwingBuscarTorneo SBT = new gui.Torneo.SwingBuscarTorneo(cardLayout,panel);
        gui.Torneo.SwingCrearTorneo SCT = new gui.Torneo.SwingCrearTorneo(cardLayout,panel);

        gui.Equipo.SwingAsociarCouch SAC = new gui.Equipo.SwingAsociarCouch(cardLayout,panel);
        gui.Equipo.SwingAsociarJugador SAJ = new gui.Equipo.SwingAsociarJugador(cardLayout,panel);
        gui.Equipo.SwingBuscarEquipo SBE = new gui.Equipo.SwingBuscarEquipo(cardLayout,panel);
        gui.Equipo.SwingNuevoEquipo SNE = new gui.Equipo.SwingNuevoEquipo(cardLayout,panel);
        gui.Equipo.SwingRegistrarATorneo SRE = new gui.Equipo.SwingRegistrarATorneo(cardLayout,panel);



        panel.add(SMP.getPanelSMenuPrincipal(),"Menu Principal");
        panel.add(SME.getPanelMenuEquipo(),"equipo");
        panel.add(SMT.getPanelMenuTorneo(),"torneo");
        panel.add(SE.getPanelProximosEventos(),"eventos");

        panel.add(SBT.getPanelBuscarTorneo(),"buscarTorneo");
        panel.add(SCT.getPanelCrearTorneo(),"crearTorneo");

        panel.add(SAC.getPanelAsociarCouch(),"asociarCouch");
        panel.add(SAJ.getPanelAsociarJugador(),"asociarJugadores");
        panel.add(SBE.getPanelBuscarEquipo(),"buscarEquipo");
        panel.add(SNE.getPanelNuevoEquipo(),"nuevoEquipo");
        panel.add(SRE.getPanelRegistrarATorneo(),"registrarATorneo");

        ventana.setContentPane(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1080,720);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}