package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAsociarJugador {
    private JButton regresarButton;
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textEdad;
    private JTextField textDocumento;
    private JTextField textNacionalidad;
    private JTextField textNickName;
    private JButton asociarButton;
    private JPanel panelAsociarJugador;
    private JButton limpiarButton;

    public SwingAsociarJugador(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "individuo");
            }
        });
        asociarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String nombre = textNombre.getText();
                    String apellido = textApellido.getText();
                    int edad = Integer.parseInt(textEdad.getText());
                    String documento =textDocumento.getText();
                    String nacionalidad = textNacionalidad.getText();
                    String nickName = textNickName.getText();

                    if (nombre.isEmpty() || apellido.isEmpty() || nacionalidad.isEmpty() || nickName.isEmpty() || documento.isEmpty()) {
                        JOptionPane.showMessageDialog(panelAsociarJugador, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    else{
                        System.out.println();
                        System.out.println("---Jugador---");
                        System.out.println(nombre + " " + apellido + " " + edad + " " + documento + " " + nacionalidad + " " + nickName);

                        textDocumento.setText("");
                        textEdad.setText("");
                        textNacionalidad.setText("");
                        textNickName.setText("");
                        textNombre.setText("");
                        textApellido.setText("");

                        JOptionPane.showMessageDialog(panelAsociarJugador,"Jugador cargado con exito!","Finalizado",JOptionPane.INFORMATION_MESSAGE);
                    }

                }

                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelAsociarJugador, "Edad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                }




            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDocumento.setText("");
                textEdad.setText("");
                textNacionalidad.setText("");
                textNickName.setText("");
                textNombre.setText("");
                textApellido.setText("");
            }
        });
    }

    public JPanel getPanelAsociarJugador() {
        return panelAsociarJugador;
    }
}
