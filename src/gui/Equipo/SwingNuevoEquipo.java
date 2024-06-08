package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingNuevoEquipo {
    private JPanel panelNuevoEquipo;
    private JButton agregarButton;
    private JButton limpiarButton;
    private JButton regresarButton;
    private JTextField textIDEquipo;
    private JTextField textNombre;
    private JTextField textResponsable;
    private JTextField textVictorias;
    private JTextField textDerrotas;

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

                try {
                    String nombre = textNombre.getText();
                    String responsable = textResponsable.getText();
                    int IDEquipo = Integer.parseInt(textIDEquipo.getText());
                    int victorias = Integer.parseInt(textVictorias.getText());
                    int derrotas = Integer.parseInt(textDerrotas.getText());


                    if (nombre.isEmpty() || responsable.isEmpty()) {
                        JOptionPane.showMessageDialog(panelNuevoEquipo, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        System.out.println();
                        System.out.println("---Equipo---");
                        System.out.println(IDEquipo + " " + nombre + " " + responsable + " " + victorias + " " + derrotas);

                        textIDEquipo.setText("");
                        textNombre.setText("");
                        textResponsable.setText("");
                        textVictorias.setText("");
                        textDerrotas.setText("");

                        JOptionPane.showMessageDialog(panelNuevoEquipo, "Equipo cargado con exito!", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelNuevoEquipo, "IDEquipo, victorias y derrotas deben ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textIDEquipo.setText("");
                textNombre.setText("");
                textResponsable.setText("");
                textVictorias.setText("");
                textDerrotas.setText("");
            }
        });
    }

    public JPanel getPanelNuevoEquipo() {
        return panelNuevoEquipo;
    }
}
