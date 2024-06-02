package clases;

public class Coach extends Persona{

  private int experiencia;
  

  public Coach() {}

  public Coach(String nombre, String apellido, int edad, int documento, String nacionalidad, int experiencia) {
    super(nombre, apellido, edad, documento, nacionalidad);
    this.experiencia = experiencia;
  }


  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

}
