package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBuscarEquipo {
    private JTextField textField1;
    private JButton buscarButton;
    private JButton limpiarButton;
    private JButton regresarButton;
    private JPanel panelBuscarEquipo;
    private JTextArea textArea1;

    public SwingBuscarEquipo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "equipo");
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanelBuscarEquipo() {
        return panelBuscarEquipo;
    }
}
