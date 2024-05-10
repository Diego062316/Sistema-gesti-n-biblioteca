package Biblioteca;

public class Categoria extends Contenido{
    //Atributos
    public String revista;
    public String libro;
    public String periodico;

    //Relaciones
    private Contenido contenido;
    private Copia[] copiaList;
    public Autor autor;

    public Categoria(String revista, String libro, String periodico) {
        this.revista = revista;
        this.libro = libro;
        this.periodico = periodico;
    }

    public String getLibro(String titulo, String anio, String codigo) {
        return libro;
    }

    public String getRevista(char titulo,String anio, String codigo) {
        return revista;
    }
    public String getPeriodico(char titulo,String anio, String codigo) {
        return periodico;
    }
}
