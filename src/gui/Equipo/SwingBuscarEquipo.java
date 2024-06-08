package gui.Equipo;

import clases.Equipo;
import control.ControlEquipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBuscarEquipo {
    private JTextField textIDEquipo;
    private JButton buscarButton;
    private JButton limpiarButton;
    private JButton regresarButton;
    private JPanel panelBuscarEquipo;
    private JTextArea textAreaEquipo;

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

                String idEquipo = textIDEquipo.getText();

                ControlEquipo controlEquipo = new ControlEquipo();
                Equipo equipo = controlEquipo.recuperarEquipo(idEquipo);

                if (idEquipo.isEmpty()) {

                    JOptionPane.showMessageDialog(panelBuscarEquipo, "Debe ingresar el nombre del Equipo", "Error", JOptionPane.ERROR_MESSAGE);

                }

                else {

                    textAreaEquipo.setText(equipo.getNombre() + " " + equipo.getResponsable());

                    textIDEquipo.setText("");

                }

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
