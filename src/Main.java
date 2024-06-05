import clases.Jugador;
import gui.CrearJugador;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("simple tetris");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        CrearJugador cj = new CrearJugador();
        ventana.add(cj);
        //el tamaño de la ventana pasa a ser el de la interfaz crearJugador
        ventana.pack();
//        drawString = crea texto
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);


    }
}