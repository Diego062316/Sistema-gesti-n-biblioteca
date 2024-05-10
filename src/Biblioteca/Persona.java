package Biblioteca;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    //Relaciones
    private Estudiante estudiante;
    private Autor autor;
    private Bibliotecaria bibliotecaria;

}
