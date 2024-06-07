package persistencia;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    public void creararchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo: " + nombreArchivo);
            FileWriter EscrituraArchivo1 = null;

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void escribirarchivo(String nombreArchivo,String contenido) {
        File archivo = new File(nombreArchivo);
        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();

            System.out.println("Se escribio el archivo: " + nombreArchivo);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void leerarchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
        try {
            List<String> lineas = Files.readAllLines(Paths.get("ResultadoTorneo.txt"));
            System.out.println(lineas);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void eliminararchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se elimino el archivo: " + nombreArchivo);
    }


    public void devolvervalores(String nombreArchivo, int cantidadLineas) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            int startIndex = Math.max(lineas.size() - cantidadLineas, 0);

            if (lineas.size() < cantidadLineas) {

                for (String linea : lineas) {
                    System.out.println(linea);
                }

                System.out.printf("El archivo contiene menos líneas de las pedidas. Se devolvieron las últimas %d líneas%n", Math.min(cantidadLineas, lineas.size()));

                return;
            }

            for (int i = startIndex; i < lineas.size(); i++) {
                System.out.println(lineas.get(i));
            }
            System.out.printf("Se devolvieron las últimas %d líneas%n", Math.min(cantidadLineas, lineas.size()));

        } catch (IOException ex) {
            System.out.println("Error al leer el archivo.");
        }
    }

}
