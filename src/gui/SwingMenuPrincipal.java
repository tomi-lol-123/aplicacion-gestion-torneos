package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMenuPrincipal {
    private JButton equipoButton;
    private JButton coachButton;
    private JButton torneoButton;
    private JPanel panelSMenuPrincipal;

    public SwingMenuPrincipal(JFrame frame, CardLayout cardLayout, JPanel cardPanel) {
        equipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "equipo");
            }
        });
        coachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "eventos");
            }
        });
        torneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });

    }

    public JPanel getPanelSMenuPrincipal() {
        return panelSMenuPrincipal;
    }
}
