package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCrearTorneo {
    private JPanel panelCrearTorneo;
    private JTextField textIDTorneo;
    private JTextField textNombre;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton valorantRadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JTextField textOrganizador;
    private JTextField textCupos;
    private JTextField textPremio;
    private JTextField textFecha;
    private JTextField textEstadisticas;
    private JTextArea textAreaReglas;
    private JButton regresarButton;
    private JButton crearTorneoButton;
    private JButton limpiarButton;
    private ButtonGroup buttonGroup;

    public SwingCrearTorneo(CardLayout cardLayout, JPanel cardPanel) {

        buttonGroup  = new ButtonGroup();
        buttonGroup.add(leagueOfLegendsRadioButton);
        buttonGroup.add(dota2RadioButton);
        buttonGroup.add(valorantRadioButton);
        buttonGroup.add(counterStrike2RadioButton);

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });
        crearTorneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int IDTorneo = Integer.parseInt(textIDTorneo.getText());
                    String Nombre = textNombre.getText();
                    String Organizador = textOrganizador.getText();
                    int Cupos = Integer.parseInt(textCupos.getText());
                    String Premio = textPremio.getText();
                    String Fecha = textFecha.getText();
                    int Estadisticas = Integer.parseInt(textEstadisticas.getText());
                    String reglasTexto = textAreaReglas.getText().trim();

                    if (Nombre.isEmpty() || Organizador.isEmpty() || Premio.isEmpty() || Fecha.isEmpty()) {
                        JOptionPane.showMessageDialog(panelCrearTorneo, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    else{

                        String juegoSeleccionado = "";
                        if (leagueOfLegendsRadioButton.isSelected()) {
                            juegoSeleccionado = "League of Legends";
                        } else if (dota2RadioButton.isSelected()) {
                            juegoSeleccionado = "Dota 2";
                        } else if (valorantRadioButton.isSelected()) {
                            juegoSeleccionado = "Valorant";
                        } else if (counterStrike2RadioButton.isSelected()) {
                            juegoSeleccionado = "Counter-Strike 2";
                        }


                        System.out.println();
                        System.out.println("---Torneo---");
                        System.out.println(IDTorneo + " " + Nombre + " " + Organizador + " " + Cupos + " " + Premio + " " + Fecha + " " + Estadisticas + " " + juegoSeleccionado + " "+ "\n" + "Reglas: " + "\n" + reglasTexto);

                        textIDTorneo.setText("");
                        textNombre.setText("");
                        textOrganizador.setText("");
                        textCupos.setText("");
                        textPremio.setText("");
                        textFecha.setText("");
                        textEstadisticas.setText("");
                        textAreaReglas.setText("");


                    }

            }

                catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panelCrearTorneo, "IDtorneo, cupos y estadisticas deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
            }


            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textIDTorneo.setText("");
                textNombre.setText("");
                textOrganizador.setText("");
                textCupos.setText("");
                textPremio.setText("");
                textFecha.setText("");
                textEstadisticas.setText("");
                textAreaReglas.setText("");

            }
        });
    }

    public JPanel getPanelCrearTorneo() {
        return panelCrearTorneo;
    }

}
