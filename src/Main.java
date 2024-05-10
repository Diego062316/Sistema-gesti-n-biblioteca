import Biblioteca.Categoria;
import Biblioteca.Estudiante;

public static void main(String[] args) {
    // Crear instancia de Estudiante
    Estudiante estudiante = new Estudiante("Juan", "Veintimilla", "1106027830");

    // Crear instancia de Categoria
    Categoria categoria = new Categoria("revista","libro","periodico");

    // Definir los datos del libro
    String tituloLibro = "Don Quijote de la Mancha";
    String anioLibro = "1605";
    String codigoLibro = "123456";

    // Asignar valores al libro en la instancia de Categoria
    categoria.libro = tituloLibro;
    // Asignar otros atributos del libro si los tienes

    // Presentar en pantalla la información del estudiante
    System.out.println("Información del Estudiante:");
    System.out.println("Nombre: " + estudiante.getNombre());
    System.out.println("Apellido: " + estudiante.getApellido());
    System.out.println("Cédula: " + estudiante.getDni());

    // Presentar en pantalla la información del libro
    System.out.println("Información del Libro:");
    System.out.println("Título: " + categoria.getLibro(tituloLibro, anioLibro, codigoLibro));

}