package gui.Equipo;

import control.ControlEquipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingNuevoEquipo {
    private JPanel panelNuevoEquipo;
    private JButton agregarButton;
    private JButton limpiarButton;
    private JButton regresarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public SwingNuevoEquipo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "equipo");
            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControlEquipo controlEquipo = new ControlEquipo();
                controlEquipo.crearEquipo(1, "Los picantes", "Amazon", 10, 1);

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanelNuevoEquipo() {
        return panelNuevoEquipo;
    }
}
