package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBuscarTorneo {
    private JTextField textIDTorneo;
    private JButton buscarButton;
    private JButton verBracketButton;
    private JPanel panelBuscarTorneo;
    private JButton regresarButton;
    private JTextArea textAreaTorneo;

    public SwingBuscarTorneo(CardLayout cardLayout, JPanel cardPanel) {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String nombreTorneo = textIDTorneo.getText();

                if (nombreTorneo.isEmpty()) {

                    JOptionPane.showMessageDialog(panelBuscarTorneo, "Debe ingresar el nombre del torneo","Error",JOptionPane.ERROR_MESSAGE);

                }

                else {

                    textAreaTorneo.setText(nombreTorneo);
                    textIDTorneo.setText("");


                }





            }
        });
        verBracketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "verBracket");
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });
    }

    public JPanel getPanelBuscarTorneo() {
        return panelBuscarTorneo;
    }
}
