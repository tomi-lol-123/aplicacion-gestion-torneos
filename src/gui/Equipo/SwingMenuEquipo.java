package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMenuEquipo {
    private JButton nuevoEquipoButton;
    private JButton buscarEquipoButton;
    private JButton asociarJugadoresButton;
    private JButton asociarCouchButton;
    private JButton registrarATorneoButton;
    private JButton regresarButton;
    private JPanel panelMenuEquipo;

    public SwingMenuEquipo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cardLayout.show(cardPanel, "Menu Principal");

            }
        });
        nuevoEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "nuevoEquipo");
            }
        });
        buscarEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "buscarEquipo");
            }
        });
        asociarJugadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "asociarJugadores");
            }
        });
        asociarCouchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "asociarCouch");
            }
        });
        registrarATorneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "registrarATorneo");
            }
        });
    }

    public JPanel getPanelMenuEquipo() {
        return panelMenuEquipo;
    }
}
