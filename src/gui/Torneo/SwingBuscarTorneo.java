package gui.Torneo;

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

public class SwingBuscarTorneo {
    private JTextField textIDTorneo;
    private JButton buscarButton;
    private JButton verBracketButton;
    private JPanel panelBuscarTorneo;
    private JButton regresarButton;
    private JTextArea textAreaTorneo;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JRadioButton valorantRadioButton;
    private ButtonGroup buttonGroup;

    public SwingBuscarTorneo(CardLayout cardLayout, JPanel cardPanel) {
        buttonGroup  = new ButtonGroup();
        buttonGroup.add(leagueOfLegendsRadioButton);
        buttonGroup.add(dota2RadioButton);
        buttonGroup.add(valorantRadioButton);
        buttonGroup.add(counterStrike2RadioButton);
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombreTorneo = textIDTorneo.getText();
                String nombreJuego = "Valorant";
                String devolucion = "";

                if (nombreTorneo.isEmpty()) {
                    JOptionPane.showMessageDialog(panelBuscarTorneo, "Debe ingresar el nombre del torneo","Error",JOptionPane.ERROR_MESSAGE);
                }

                else {
                    String juegoSeleccionado = "";

                    if (leagueOfLegendsRadioButton.isSelected()) {
                        juegoSeleccionado = "League of Legends";
                        ControlTorneoMoba controlTorneo = new ControlTorneoMoba();
                        try {
                            TorneoMoba torneo = controlTorneo.recuperarTorneo(nombreTorneo);
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
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    else if (dota2RadioButton.isSelected()) {
                        ControlTorneoMoba controlTorneo = new ControlTorneoMoba();
                        try {
                            TorneoMoba torneo = controlTorneo.recuperarTorneo(nombreTorneo);
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
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    else if (valorantRadioButton.isSelected()) {
                        juegoSeleccionado = "Valorant";
                        System.out.println("valorant");
                        ControlTorneoValorant controlTorneo = new ControlTorneoValorant();
                        try {
                            TorneoValorant torneo = controlTorneo.recuperarTorneo(nombreTorneo);
                            devolucion =
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
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    else if (counterStrike2RadioButton.isSelected()) {
                        juegoSeleccionado = "Counter-Strike";
                        ControlTorneoCounter controlTorneo = new ControlTorneoCounter();
                        try {
                            TorneoCounter torneo = controlTorneo.recuperarTorneo(nombreTorneo);
                            devolucion =
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
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }
                    }

                if (nombreTorneo.isEmpty()) {
                    JOptionPane.showMessageDialog(panelBuscarTorneo, "Debe ingresar el nombre del torneo","Error",JOptionPane.ERROR_MESSAGE);
                }

                textAreaTorneo.setText(devolucion);
                textIDTorneo.setText("");

            }}
        });
        verBracketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "verBracket");
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });
    }

    public JPanel getPanelBuscarTorneo() {
        return panelBuscarTorneo;
    }
}
