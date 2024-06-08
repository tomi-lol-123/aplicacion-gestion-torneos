package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingVerBracket {
    private JPanel panelVerBracket;
    private JTextField textPartido;
    private JTextField textPasaRonda;
    private JTextArea textAreaBracket;
    private JButton regresarBoton;
    private JButton aceptarButton;
    private JButton limpiarButton;

    public SwingVerBracket(CardLayout cardLayout, JPanel cardPanel) {

        regresarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "buscarTorneo");
            }
        });

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int partido = Integer.parseInt(textPartido.getText());
                    int pasa = Integer.parseInt(textPasaRonda.getText());

                    textAreaBracket.setText("Del partido " + partido + " Pasa " + pasa);
                    textPartido.setText("");
                    textPasaRonda.setText("");
                }

                catch(NumberFormatException ex){

                    JOptionPane.showMessageDialog(panelVerBracket, "Debes ingresar números enteros", "Error", JOptionPane.ERROR_MESSAGE);


                }



            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPartido.setText("");
                textPasaRonda.setText("");
                textAreaBracket.setText("");
            }
        });
    }

    public JPanel getPanelVerBracket() {
        return panelVerBracket;
    }


}
