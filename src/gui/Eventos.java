package gui;

import clases.TorneoCounter;
import clases.TorneoMoba;
import clases.TorneoValorant;
import control.ControlTorneoCounter;
import control.ControlTorneoMoba;
import control.ControlTorneoValorant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Eventos {
    private JButton regresar;
    private JPanel panelProximosEventos;
    private JTextArea textAreaEventos;
    private JButton verTodoButton;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton valorantRadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JButton verButton;
    private JButton limpiarButton;
    private ButtonGroup buttonGroup;

    public Eventos(CardLayout cardLayout, JPanel cardPanel) {

        buttonGroup  = new ButtonGroup();
        buttonGroup.add(leagueOfLegendsRadioButton);
        buttonGroup.add(dota2RadioButton);
        buttonGroup.add(valorantRadioButton);
        buttonGroup.add(counterStrike2RadioButton);


        //For que saque los 10 ultimos y los setee en el textarea



        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });

        verTodoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaEventos.setText("Todos los eventos" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3" + "\n" + "Evento 4" + "\n" +"Evento 5" + "\n" + "Evento 6" + "\n" + "Evento 7" + "\n" + "Evento 8" + "\n" + "Evento 9" + "\n" + "Evento 10" + "\n" + "Evento 11" + "\n" + "Evento 12");

            }
        });
        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String juegoSeleccionado = "";
                String devolucion = "";

                if (leagueOfLegendsRadioButton.isSelected()) {
                    juegoSeleccionado = "League of Legends";

                    ControlTorneoMoba controlTorneoMoba = new ControlTorneoMoba();
                    try {
                        for (TorneoMoba torneo : controlTorneoMoba.recuperarTorneos(juegoSeleccionado)){
                            devolucion +=
                                    "Nombre: " + torneo.getNombre() + "\n" +
                                    "Organizador: " + torneo.getOrganizador() + "\n" +
                                    "Videojuego: " + torneo.getVideojuego() + "\n" +
                                    "Cupos: " + torneo.getCupos() + "\n" +
                                    "Fecha: " + torneo.getFecha() + "\n" +
                                    "Descripcion: " + torneo.getVideojuego() + "\n" +
                                    "Premios: " + torneo.getPremios() + "\n" +
                                    "Oro total: " + torneo.getOroTotal() + "\n" +
                                    "Torretas destruidas: " + torneo.getTorretasDestruidas() + "\n" +
                                    "Inhibidores destruidos: " + torneo.getInhibidoresDestruidos() + "\n" +
                                    "Objetivo mas capturado: " + torneo.getObjetivoMasCapturados() + "\n" +
                                    "------------------------------------------------------------- \n";

                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }


                } else if (dota2RadioButton.isSelected()) {
                    juegoSeleccionado = "Dota";
                    ControlTorneoMoba controlTorneoMoba = new ControlTorneoMoba();

                    try {
                        for (TorneoMoba torneo : controlTorneoMoba.recuperarTorneos(juegoSeleccionado)){
                            devolucion +=
                                    "Nombre: " + torneo.getNombre() + "\n" +
                                            "Organizador: " + torneo.getOrganizador() + "\n" +
                                            "Videojuego: " + torneo.getVideojuego() + "\n" +
                                            "Cupos: " + torneo.getCupos() + "\n" +
                                            "Fecha: " + torneo.getFecha() + "\n" +
                                            "Descripcion: " + torneo.getVideojuego() + "\n" +
                                            "Premios: " + torneo.getPremios() + "\n" +
                                            "Oro total: " + torneo.getOroTotal() + "\n" +
                                            "Torretas destruidas: " + torneo.getTorretasDestruidas() + "\n" +
                                            "Inhibidores destruidos: " + torneo.getInhibidoresDestruidos() + "\n" +
                                            "Objetivo mas capturado: " + torneo.getObjetivoMasCapturados() + "\n" +
                                            "------------------------------------------------------------- \n";

                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }

                } else if (valorantRadioButton.isSelected()) {
                    juegoSeleccionado = "Valorant";

                    ControlTorneoValorant controlTorneoValorant = new ControlTorneoValorant();
                    try {
                        for (TorneoValorant torneo : controlTorneoValorant.recuperarTorneos(juegoSeleccionado)){
                            devolucion +=
                                    "Nombre: " + torneo.getNombre() + "\n" +
                                            "Organizador: " + torneo.getOrganizador() + "\n" +
                                            "Videojuego: " + torneo.getVideojuego() + "\n" +
                                            "Cupos: " + torneo.getCupos() + "\n" +
                                            "Fecha: " + torneo.getFecha() + "\n" +
                                            "Descripcion: " + torneo.getVideojuego() + "\n" +
                                            "Premios: " + torneo.getPremios() + "\n" +
                                            "Bajas totales: " + torneo.getBajasTotales() + "\n" +
                                            "Rondas totales: " + torneo.getRondasTotales() + "\n" +
                                            "Arma mas popular: " + torneo.getArmarMasPopular() + "\n" +
                                            "Campeon mas pickeado: " + torneo.getChampMasPickeado() + "\n" +
                                            "------------------------------------------------------------- \n";

                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }

                } else if (counterStrike2RadioButton.isSelected()) {
                    juegoSeleccionado = "Counter-Strike";

                    ControlTorneoCounter controlTorneoCounter = new ControlTorneoCounter();
                    try {
                        for (TorneoCounter torneo : controlTorneoCounter.recuperarTorneos(juegoSeleccionado)){
                            devolucion +=
                                    "Nombre: " + torneo.getNombre() + "\n" +
                                            "Organizador: " + torneo.getOrganizador() + "\n" +
                                            "Videojuego: " + torneo.getVideojuego() + "\n" +
                                            "Cupos: " + torneo.getCupos() + "\n" +
                                            "Fecha: " + torneo.getFecha() + "\n" +
                                            "Descripcion: " + torneo.getVideojuego() + "\n" +
                                            "Premios: " + torneo.getPremios() + "\n" +
                                            "Bajas totales: " + torneo.getBajasTotales() + "\n" +
                                            "Rondas totales: " + torneo.getRondasTotales() + "\n" +
                                            "Arma mas popular: " + torneo.getArmarMasPopular() + "\n" +
                                            "Muertes por fuego amigo: " + torneo.getMuertesPorFuegoAmigo() + "\n" +
                                            "------------------------------------------------------------- \n";

                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }


                }
                textAreaEventos.setText(devolucion);

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaEventos.setText("");
            }
        });
    }

    public JPanel getPanelProximosEventos() {
        return panelProximosEventos;
    }
}
