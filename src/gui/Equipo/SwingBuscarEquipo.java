package gui.Equipo;

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

                String nombreEquipo = textIDEquipo.getText();

                if (nombreEquipo.isEmpty()) {

                    JOptionPane.showMessageDialog(panelBuscarEquipo, "Debe ingresar el nombre del Equipo", "Error", JOptionPane.ERROR_MESSAGE);

                }

                else {

                    textAreaEquipo.setText(nombreEquipo);

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
