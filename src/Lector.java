public class Lector {

    private String id;
    private String nombre;
    private Libro libroPrestado;

    public Lector(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libroPrestado = null;
    }

    public void prestarLibro(Libro libro) {

        if (libroPrestado != null) {
            System.out.println(nombre + " ya tiene un libro prestado.");
            return;
        }

        if (libro.prestar()) {
            libroPrestado = libro;
            System.out.println(nombre + " tomó prestado \"" + libro.getTitulo() + "\"");
        }
    }

    public void devolverLibro() {

        if (libroPrestado != null) {
            libroPrestado.devolver();
            System.out.println(nombre + " devolvió el libro.");
            libroPrestado = null;
        } else {
            System.out.println(nombre + " no tiene libros prestados.");
        }
    }

    public void volverAPrestar(Libro nuevoLibro) {

        devolverLibro();
        prestarLibro(nuevoLibro);

    }

    public void mostrarEstado() {

        if (libroPrestado != null) {
            System.out.println(nombre + " tiene prestado: " + libroPrestado.getTitulo());
        } else {
            System.out.println(nombre + " no tiene ningún libro.");
        }

    }
}