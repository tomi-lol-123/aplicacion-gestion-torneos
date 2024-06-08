package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos {
    private JButton regresar;
    private JPanel panelProximosEventos;
    private JTextArea textAreaEventos;
    private JButton verTodoButton;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton valorantRadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JButton verButton;
    private JButton limpiarButton;
    private ButtonGroup buttonGroup;

    public Eventos(CardLayout cardLayout, JPanel cardPanel) {

        buttonGroup  = new ButtonGroup();
        buttonGroup.add(leagueOfLegendsRadioButton);
        buttonGroup.add(dota2RadioButton);
        buttonGroup.add(valorantRadioButton);
        buttonGroup.add(counterStrike2RadioButton);


        //For que saque los 10 ultimos y los setee en el textarea



        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Menu Principal");
            }
        });

        verTodoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaEventos.setText("Todos los eventos" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3" + "\n" + "Evento 4" + "\n" +"Evento 5" + "\n" + "Evento 6" + "\n" + "Evento 7" + "\n" + "Evento 8" + "\n" + "Evento 9" + "\n" + "Evento 10" + "\n" + "Evento 11" + "\n" + "Evento 12");

            }
        });
        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String juegoSeleccionado = "";
                if (leagueOfLegendsRadioButton.isSelected()) {
                    juegoSeleccionado = "League of Legends";
                    textAreaEventos.setText("3 Últimos eventos de League of Legends" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3");


                } else if (dota2RadioButton.isSelected()) {
                    juegoSeleccionado = "Dota 2";
                    textAreaEventos.setText("3 Últimos eventos de Dota 2" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3");


                } else if (valorantRadioButton.isSelected()) {
                    juegoSeleccionado = "Valorant";
                    textAreaEventos.setText("3 Últimos eventos de Valorant" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3");


                } else if (counterStrike2RadioButton.isSelected()) {
                    juegoSeleccionado = "Counter-Strike 2";
                    textAreaEventos.setText("3 Últimos eventos de Counter-Strike 2" + "\n" + "\n" + "Evento 1" + "\n" + "Evento 2" + "\n" + "Evento 3");


                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaEventos.setText("");
            }
        });
    }

    public JPanel getPanelProximosEventos() {
        return panelProximosEventos;
    }
}
