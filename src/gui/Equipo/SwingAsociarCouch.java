package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAsociarCouch {
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textNacionalidad;
    private JTextField textExperiencia;
    private JButton regresarButton;
    private JButton asociarButton;
    private JButton limpiarButton;
    private JPanel panelAsociarCouch;

    public SwingAsociarCouch(CardLayout cardLayout, JPanel cardPanel) {


        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "individuo");
            }
        });
        asociarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String nombre = textNombre.getText();
                    String apellido = textApellido.getText();
                    int experiencia = Integer.parseInt(textExperiencia.getText());
                    String nacionalidad = textNacionalidad.getText();


                    if (nombre.isEmpty() || apellido.isEmpty() || nacionalidad.isEmpty()) {
                        JOptionPane.showMessageDialog(panelAsociarCouch, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        System.out.println();
                        System.out.println("---Couch---");
                        System.out.println(nombre + " " + apellido + " " + nacionalidad + " " + experiencia);

                        textExperiencia.setText("");
                        textNacionalidad.setText("");
                        textNombre.setText("");
                        textApellido.setText("");


                        JOptionPane.showMessageDialog(panelAsociarCouch, "Couch cargado con exito!", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelAsociarCouch, "Experiencia debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textExperiencia.setText("");
                textNacionalidad.setText("");
                textNombre.setText("");
                textApellido.setText("");
            }
        });
    }

    public JPanel getPanelAsociarCouch() {
        return panelAsociarCouch;
    }
}
