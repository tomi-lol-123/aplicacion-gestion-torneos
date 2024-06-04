package gui;

import clases.Jugador;
import clases.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipoSwing {
    private JTextField textIDEquipo;
    private JTextField textVictorias;
    private JTextField textNombre;
    private JTextField textResponsable;
    private JTextField textDerrotas;
    private JButton agregarButton;
    private JButton visualizarButton;
    private JPanel panelEquipo;
    private JTextArea textArea1;
    private JButton regresarButton;

    private Jugador[] jugadores;
    private Equipo equipo;

    public EquipoSwing(CardLayout cardLayout, JPanel cardPanel) {
        jugadores = new Jugador[5];


        ImageIcon addTeamButton = new ImageIcon("E:\\Usuario\\Escritorio\\aplicacion-gestion-torneos-desarrollo1\\src\\img\\addTeam.png");
        Image addTeamButtonSize = addTeamButton.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon addTeamButtonIcon = new ImageIcon(addTeamButtonSize);
        agregarButton.setIcon(addTeamButtonIcon);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(textIDEquipo.getText());
                    String nombre = textNombre.getText();
                    String responsable = textResponsable.getText();
                    int victorias = Integer.parseInt(textVictorias.getText());
                    int derrotas = Integer.parseInt(textDerrotas.getText());

                    equipo = new Equipo(id, nombre, responsable, victorias, derrotas, jugadores);

                    textIDEquipo.setText("");
                    textNombre.setText("");
                    textResponsable.setText("");
                    textVictorias.setText("");
                    textDerrotas.setText("");

                    JOptionPane.showMessageDialog(panelEquipo, "Equipo creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelEquipo, "ID, Victorias y Derrotas deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equipo != null) {
                    textArea1.setText(equipo.imprimir());
                } else {
                    JOptionPane.showMessageDialog(panelEquipo, "Primero crea el equipo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
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
        return panelEquipo;
    }
}
