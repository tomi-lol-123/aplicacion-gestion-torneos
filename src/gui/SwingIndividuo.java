package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingIndividuo {
    private JButton asociarJugadorButton;
    private JButton asociarCoachButton;
    private JButton regresarButton;
    private JPanel panelIndividuo;

    public SwingIndividuo(CardLayout cardLayout, JPanel cardPanel) {
        asociarJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "asociarJugadores");
            }
        });
        asociarCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "asociarCouch");
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });
    }

    public JPanel getPanelIndividuo() {
        return panelIndividuo;
    }
}
