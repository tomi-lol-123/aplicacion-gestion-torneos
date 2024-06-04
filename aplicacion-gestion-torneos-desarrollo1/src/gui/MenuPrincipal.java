package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    private JButton agregarJugadorButton;
    private JButton agregarEquipoButton;
    private JPanel panelMenuPrincipal;

    public MenuPrincipal(JFrame frame, CardLayout cardLayout, JPanel cardPanel) {
        agregarJugadorButton = new JButton("Agregar Jugador");
        agregarEquipoButton = new JButton("Agregar Equipo");
        panelMenuPrincipal = new JPanel();

        panelMenuPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelMenuPrincipal.add(agregarJugadorButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panelMenuPrincipal.add(agregarEquipoButton, gbc);

        agregarJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Agregar Jugador");
            }
        });

        agregarEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Agregar Equipo");
            }
        });
    }

    public JPanel getPanelMenuPrincipal() {
        return panelMenuPrincipal;
    }
}
