import gui.MenuPrincipal;
import gui.Pruebas;
import gui.EquipoSwing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Gestión de Torneos");
                CardLayout cardLayout = new CardLayout();
                JPanel cardPanel = new JPanel(cardLayout);

                MenuPrincipal menuPrincipal = new MenuPrincipal(frame, cardLayout, cardPanel);
                Pruebas pruebas = new Pruebas(cardLayout, cardPanel);
                EquipoSwing equipoSwing = new EquipoSwing(cardLayout, cardPanel);

                cardPanel.add(menuPrincipal.getPanelMenuPrincipal(), "Menu Principal");
                cardPanel.add(pruebas.getPanelPrincipal(), "Agregar Jugador");
                cardPanel.add(equipoSwing.getPanelPrincipal(), "Agregar Equipo");

                frame.setContentPane(cardPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                cardLayout.show(cardPanel, "Menu Principal");
            }
        });
    }
}
