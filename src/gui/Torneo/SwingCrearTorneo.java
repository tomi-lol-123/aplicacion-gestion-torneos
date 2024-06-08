package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCrearTorneo {
    private JPanel panelCrearTorneo;
    private JTextField textNombre;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton valorantRadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JTextField textOrganizador;
    private JTextField textCupos;
    private JTextField textPremio;
    private JTextField textFecha;
    private JTextArea textAreaReglas;
    private JButton regresarButton;
    private JButton crearTorneoButton;
    private JButton limpiarButton;
    private JTextField textEstadistica1;
    private JTextField textEstadistica2;
    private JTextField textEstadistica4;
    private JTextField textEstadistica3;
    private JLabel Estadistica1;
    private JLabel Estadistica2;
    private JLabel Estadistica3;
    private JLabel Estadistica4;
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
                    String Nombre = textNombre.getText();
                    String Organizador = textOrganizador.getText();
                    int Cupos = Integer.parseInt(textCupos.getText());
                    String Premio = textPremio.getText();
                    String Fecha = textFecha.getText();
                    String reglasTexto = textAreaReglas.getText().trim();


                    if (Nombre.isEmpty() || Organizador.isEmpty() || Premio.isEmpty() || Fecha.isEmpty() || reglasTexto.isEmpty()) {
                        JOptionPane.showMessageDialog(panelCrearTorneo, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    else{
                        String estadisticas = "";
                        String juegoSeleccionado = "";
                        if (leagueOfLegendsRadioButton.isSelected()) {
                            juegoSeleccionado = "League of Legends";

                            int Esta1 = Integer.parseInt(textEstadistica1.getText());
                            int Esta2 = Integer.parseInt(textEstadistica2.getText());
                            int Esta3 = Integer.parseInt(textEstadistica3.getText());
                            String Esta4 = textEstadistica4.getText();

                            estadisticas = "Estadísticas:\n" +
                                    "Inhibidores destruidos: " + Esta1 + "\n" +
                                    "Torretas destruidas: " + Esta2 + "\n" +
                                    "Oro total: " + Esta3 + "\n" +
                                    "Objetivo más capturado: " + Esta4 + "\n";


                        } else if (dota2RadioButton.isSelected()) {
                            juegoSeleccionado = "Dota 2";

                            int Esta1 = Integer.parseInt(textEstadistica1.getText());
                            int Esta2 = Integer.parseInt(textEstadistica2.getText());
                            int Esta3 = Integer.parseInt(textEstadistica3.getText());
                            String Esta4 = textEstadistica4.getText();

                            estadisticas = "Estadísticas:\n" +
                                    "Inhibidores destruidos: " + Esta1 + "\n" +
                                    "Torretas destruidas: " + Esta2 + "\n" +
                                    "Oro total: " + Esta3 + "\n" +
                                    "Objetivo más capturado: " + Esta4 + "\n";

                        } else if (valorantRadioButton.isSelected()) {
                            juegoSeleccionado = "Valorant";

                            int Esta1 = Integer.parseInt(textEstadistica1.getText());
                            int Esta2 = Integer.parseInt(textEstadistica2.getText());
                            String Esta3 = textEstadistica3.getText();
                            String Esta4 = textEstadistica4.getText();

                            estadisticas = "Estadísticas:\n" +
                                    "Rondas totales: " + Esta1 + "\n" +
                                    "Bajas totales: " + Esta2 + "\n" +
                                    "Arma más popular: " + Esta3 + "\n" +
                                    "Campeón mas pickeado: " + Esta4 + "\n";

                        } else if (counterStrike2RadioButton.isSelected()) {
                            juegoSeleccionado = "Counter-Strike 2";

                            int Esta1 = Integer.parseInt(textEstadistica1.getText());
                            int Esta2 = Integer.parseInt(textEstadistica2.getText());
                            int Esta3 = Integer.parseInt(textEstadistica3.getText());
                            int Esta4 = Integer.parseInt(textEstadistica4.getText());

                            estadisticas = "Estadísticas:\n" +
                                    "Rondas totales: " + Esta1 + "\n" +
                                    "Bajas totales: " + Esta2 + "\n" +
                                    "Arma más popular: " + Esta3 + "\n" +
                                    "Muertes por fuego amigo: " + Esta4 + "\n";
                        }


                        System.out.println();
                        System.out.println("---Torneo---");
                        System.out.println(Nombre + " " + Organizador + " " + Cupos + " " + Premio + " " + Fecha + " " + juegoSeleccionado + " " + "\n" + estadisticas + "\n" + "Reglas: " +  "\n" + reglasTexto);
                        System.out.println();

                        textNombre.setText("");
                        textOrganizador.setText("");
                        textCupos.setText("");
                        textPremio.setText("");
                        textFecha.setText("");
                        textAreaReglas.setText("");
                        textEstadistica1.setText("");
                        textEstadistica2.setText("");
                        textEstadistica3.setText("");
                        textEstadistica4.setText("");


                    }

            }

                catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panelCrearTorneo, "Cupos y estadisticas deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
            }


            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textNombre.setText("");
                textOrganizador.setText("");
                textCupos.setText("");
                textPremio.setText("");
                textFecha.setText("");
                textAreaReglas.setText("");
                textEstadistica1.setText("");
                textEstadistica2.setText("");
                textEstadistica3.setText("");
                textEstadistica4.setText("");
            }
        });


        leagueOfLegendsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Estadistica1.setText("Inhibidores destruidos");
                Estadistica2.setText("Torretas destruidas");
                Estadistica3.setText("Oro total");
                Estadistica4.setText("Objetivo mas capturado");

            }
        });
        dota2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estadistica1.setText("Inhibidores destruidos");
                Estadistica2.setText("Torretas destruidas");
                Estadistica3.setText("Oro total");
                Estadistica4.setText("Objetivo mas capturado");

            }
        });
        valorantRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estadistica1.setText("Rondas totales");
                Estadistica2.setText("Bajas totales");
                Estadistica3.setText("Arma más popular");
                Estadistica4.setText("Campeón mas pickeado");

            }
        });
        counterStrike2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estadistica1.setText("Rondas totales");
                Estadistica2.setText("Bajas totales");
                Estadistica3.setText("Arma más popular");
                Estadistica4.setText("Muertes por fuego amigo");


            }
        });
    }

    public JPanel getPanelCrearTorneo() {
        return panelCrearTorneo;
    }

}
