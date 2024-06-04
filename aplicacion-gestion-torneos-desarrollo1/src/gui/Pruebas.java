package gui;

import clases.Equipo;
import clases.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pruebas {
    private JPanel panelPrincipal;
    private JTextField textApellido;
    private JTextField textDocumento;
    private JTextField textNickName;
    private JTextField textNombre;
    private JTextField textEdad;
    private JTextField textNacionalidad;
    private JButton agregarButton;
    private JButton cancelarButton;
    private JButton visualizarButton;
    private JTextArea textArea1;
    private JButton regresarButton;

    private Jugador[] jugadores;
    private int indiceJugador;

    public Pruebas(CardLayout cardLayout, JPanel cardPanel) {
        jugadores = new Jugador[5];
        indiceJugador = 0;
        Equipo eq1 = new Equipo(1, "Vagabundos", "Martos", 1, 12, jugadores);


        ImageIcon addPersonButton = new ImageIcon("E:\\Usuario\\Escritorio\\aplicacion-gestion-torneos-desarrollo1\\src\\img\\addPerson.png");
        Image addPersonButtonSize = addPersonButton.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon addPersonButtonIcon = new ImageIcon(addPersonButtonSize);
        agregarButton.setIcon(addPersonButtonIcon);


        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indiceJugador < 5) {
                    try {
                        String nombre = textNombre.getText();
                        String apellido = textApellido.getText();
                        int edad = Integer.parseInt(textEdad.getText());
                        int documento = Integer.parseInt(textDocumento.getText());
                        String nacionalidad = textNacionalidad.getText();
                        String nickName = textNickName.getText();

                        if (nombre.isEmpty() || apellido.isEmpty() || nacionalidad.isEmpty() || nickName.isEmpty()) {
                            JOptionPane.showMessageDialog(panelPrincipal, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        Jugador jugador = new Jugador(nombre, apellido, edad, documento, nacionalidad, nickName);
                        jugadores[indiceJugador] = jugador;
                        indiceJugador++;

                        textNombre.setText("");
                        textApellido.setText("");
                        textDocumento.setText("");
                        textNickName.setText("");
                        textEdad.setText("");
                        textNacionalidad.setText("");

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(panelPrincipal, "Edad y Documento deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Se ha alcanzado el límite de 5 jugadores.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNombre.setText("");
                textApellido.setText("");
                textDocumento.setText("");
                textNickName.setText("");
                textEdad.setText("");
                textNacionalidad.setText("");
            }
        });

        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(eq1.imprimir());
            }
        });


        ImageIcon backButton = new ImageIcon("E:\\Usuario\\Escritorio\\aplicacion-gestion-torneos-desarrollo1\\src\\img\\back.png");
        Image backButtonSize = backButton.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon backButtonIcon = new ImageIcon(backButtonSize);
        regresarButton.setIcon(backButtonIcon);

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}
