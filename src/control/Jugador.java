package control;
public class Jugador extends Persona{

    private String nickName;

    private int victorias;

    private int derrotas;

    public void i(){
        System.out.println(this.nombre);
        System.out.println(nickName);
        System.out.println(victorias);
        System.out.println(derrotas);
    }


    public Jugador() {
    }

    

    public Jugador(String nombre, String apellido, int edad, int documento, String nacionalidad, String nickName,
            int victorias, int derrotas) {
        super(nombre, apellido, edad, documento, nacionalidad);
        this.nickName = nickName;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
