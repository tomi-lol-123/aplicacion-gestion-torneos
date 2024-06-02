package clases;
public class Jugador extends Persona{

    private String nickName;

    public void i(){
        System.out.println(this.nombre);
        System.out.println(nickName);
    }


    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int documento, String nacionalidad, String nickName) {
        super(nombre, apellido, edad, documento, nacionalidad);
        this.nickName = nickName;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
