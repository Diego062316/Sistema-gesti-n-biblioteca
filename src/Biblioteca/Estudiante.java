package Biblioteca;

public class Estudiante extends Persona {
    private String expediente;
    private String dni;

    public Estudiante(String nombre,String apellido,String dni){
        super (nombre, apellido);
        this.dni = dni;
    }
    public String getDni(){
        return dni;
    }
    public String getExpediente(){
        return expediente;
    }
    //Relaciones
    private Multa[] multaList;
    private Persona persona;
}
