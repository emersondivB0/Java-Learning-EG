package com.dosmildostres.herencia;

public class Persona {
  protected String nombre;
  protected int edad;
  protected char genero;
  protected String direccion;

  public Persona() {
  }

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public Persona(String nombre, int edad, char genero, String direccion) {
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public char getGenero() {
    return this.genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Persona{nombre=").append(nombre);
    sb.append(", genero=").append(genero);
    sb.append(", edad=").append(edad);
    sb.append(", direccion=").append(direccion);
    sb.append('}');
    return sb.toString();
  }
}
