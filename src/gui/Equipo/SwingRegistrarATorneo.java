package gui.Equipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingRegistrarATorneo {
    private JTextField textNombreTorneo;
    private JPanel panelRegistrarATorneo;
    private JButton regresarButton;
    private JButton registrarEquipoButton;
    private JTextField textIDEquipo;

    public SwingRegistrarATorneo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });

        registrarEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idEquipo = Integer.parseInt(textIDEquipo.getText());
                String nombreTorneo = textNombreTorneo.getText();

                System.out.println("IDEquipo " + idEquipo + " " + "Nombre torneo " + nombreTorneo);

            }
        });
    }

    public JPanel getPanelRegistrarATorneo() {
        return panelRegistrarATorneo;
    }
}
