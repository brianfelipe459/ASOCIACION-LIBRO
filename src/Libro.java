public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro \"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
            return false;
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro \"" + titulo + "\" fue devuelto.");
    }
}