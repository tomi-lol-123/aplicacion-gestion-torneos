package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingRegistrarATorneo {
    private JTextField textField1;
    private JPanel panelRegistrarATorneo;
    private JButton regresarButton;

    public SwingRegistrarATorneo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "equipo");
            }
        });
    }

    public JPanel getPanelRegistrarATorneo() {
        return panelRegistrarATorneo;
    }
}
