package persistencia;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operaciones {

    public void crearArchivo(String path){
        File archivo = new File(path);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo: " + path);
            FileWriter EscrituraArchivo1 = null;

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void agregarRegistro(String path,String contenido) {
        File archivo = new File(path);
        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();

            System.out.println("Se escribio el archivo: " + path);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public String[] recuperarRegistro(String path, String objetivo) {

        File archivo = new File(path);
        String linea = null;

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            linea = entrada.readLine();

            while (linea != null && !linea.split(";")[0].equals(objetivo)) {

                linea = entrada.readLine();
            }
            entrada.close();

        }
        catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        catch (IOException ex){
            ex.printStackTrace(System.out);
        }

        return linea.split(";");
    }

    public void eliminararchivo(String path) {
        File archivo = new File(path);
        archivo.delete();
        System.out.println("Se elimino el archivo: " + path);
    }

    public void borrarRegistro(String path, String objetivo) {

        String archTemp = "temp.txt";
        File archViejo = new File(path);
        File archNuevo = new File(archTemp);

        String lineaActual;

        try{

            FileWriter fW = new FileWriter(archTemp, true);
            BufferedWriter bW = new BufferedWriter(fW);
            PrintWriter pW = new PrintWriter(bW);

            FileReader fR = new FileReader(path);
            BufferedReader bR = new BufferedReader(fR);

            while ((lineaActual = bR.readLine()) != null) {

                if (!objetivo.equals(lineaActual.split(";")[0])) {
                    pW.println(lineaActual);
                }
            }

            pW.flush();
            pW.close();
            fR.close();
            bR.close();
            bW.close();
            fW.close();

            archViejo.delete();
            File nombreOriginal = new File(path);
            archNuevo.renameTo(nombreOriginal);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    
    public ArrayList<String[]> recuperarRegistros(String path) {

        File archivo = new File(path);
        String linea = null;
        ArrayList<String[]> registros = new ArrayList<String[]>();

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            linea = entrada.readLine();

            while (linea != null) {

                registros.add(linea.split(";"));

                linea = entrada.readLine();
            }
            entrada.close();

        }
        catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        catch (IOException ex){
            ex.printStackTrace(System.out);
        }

        return registros;
    }

    public ArrayList<String[]> recuperarRegistros(String path, String juego) {

        File archivo = new File(path);
        String linea = null;
        ArrayList<String[]> registros = new ArrayList<String[]>();

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            linea = entrada.readLine();

            while (linea != null) {
                String[] registro = linea.split(";");
                if (registro[2].equals(juego)){
                    registros.add(registro);
                }

                linea = entrada.readLine();
            }
            entrada.close();

        }
        catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        catch (IOException ex){
            ex.printStackTrace(System.out);
        }

        return registros;
    }

    public void actualizarRegistro(String path, String objetivo, String registroActualizado) {
        borrarRegistro(path, objetivo);
        agregarRegistro(path, registroActualizado);
    }

}
