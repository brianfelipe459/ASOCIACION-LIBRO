public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro4 = new Libro("La Odisea", "Homero");
        Libro libro5 = new Libro("El Alquimista", "Paulo Coelho");

        Lector lector1 = new Lector("1", "Juan");
        Lector lector2 = new Lector("2", "María");
        Lector lector3 = new Lector("3", "Carlos");
        Lector lector4 = new Lector("4", "Ana");
        Lector lector5 = new Lector("5", "Pedro");

        System.out.println("=== PRÉSTAMOS ===");
        lector1.prestarLibro(libro1);
        lector2.prestarLibro(libro2);
        lector3.prestarLibro(libro3);

        System.out.println("\n=== Intentando prestar un libro ya prestado ===");
        lector4.prestarLibro(libro1);

        System.out.println("\n=== Devolviendo libro ===");
        lector1.devolverLibro();

        System.out.println("\n=== Prestando nuevamente el libro ===");
        lector5.prestarLibro(libro1);

        System.out.println("\n=== Pedro cambia de libro ===");
        lector5.volverAPrestar(libro5);

        System.out.println("\n=== ESTADO FINAL ===");
        lector1.mostrarEstado();
        lector2.mostrarEstado();
        lector3.mostrarEstado();
        lector4.mostrarEstado();
        lector5.mostrarEstado();
    }
}