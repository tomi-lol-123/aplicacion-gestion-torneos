package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos {
    private JButton regresar;
    private JPanel panelProximosEventos;
    private JTextArea textArea1;

    public Eventos(CardLayout cardLayout, JPanel cardPanel) {
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });
    }

    public JPanel getPanelProximosEventos() {
        return panelProximosEventos;
    }
}
