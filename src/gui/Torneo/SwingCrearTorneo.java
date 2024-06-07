package gui.Torneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCrearTorneo {
    private JPanel panelCrearTorneo;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton leagueOfLegendsRadioButton;
    private JRadioButton dota2RadioButton;
    private JRadioButton valorantRadioButton;
    private JRadioButton counterStrike2RadioButton;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextArea textArea1;
    private JButton regresarButton;

    public SwingCrearTorneo(CardLayout cardLayout, JPanel cardPanel) {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "torneo");
            }
        });
    }

    public JPanel getPanelCrearTorneo() {
        return panelCrearTorneo;
    }
}
