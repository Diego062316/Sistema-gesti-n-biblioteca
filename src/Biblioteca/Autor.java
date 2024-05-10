package Biblioteca;

public class Autor extends Persona {
    //Atributos
    private String origen;

    public Autor(String nombre,String apellido,String Origen){
       super(nombre, apellido);
       this.origen = origen;

    }
    //Relaciones
    public Categoria[] categoriaList;

}
