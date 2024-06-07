package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMenuTorneo {
    private JPanel panelMenuTorneo;
    private JButton crearTorneoButton;
    private JButton buscarTorneoButton;
    private JButton regresarButton;

    public SwingMenuTorneo(CardLayout cardLayout, JPanel cardPanel) {
        crearTorneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "crearTorneo");
            }
        });
        buscarTorneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "buscarTorneo");
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });
    }

    public JPanel getPanelMenuTorneo() {
        return panelMenuTorneo;
    }
}
