package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBuscarTorneo {
    private JTextField textField1;
    private JButton buscarButton;
    private JButton verBracketButton;
    private JPanel panelBuscarTorneo;
    private JButton regresarButton;

    public SwingBuscarTorneo(CardLayout cardLayout, JPanel cardPanel) {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        verBracketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
