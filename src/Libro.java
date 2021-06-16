package src;

/**
 *
 * @author emili
 */
//Clase Libro que se encuentra dentro de paquete src
public class Libro {
    // Variables

    private String Nombre;
    private int anioPublicacion;
    private String Autor;
    private boolean Prestado;
    //Constructor que pide como parametros 

    public Libro(String nombre, int anioPublicacion, String autor, boolean prestado) {
        this.Nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.Autor = autor;
        this.Prestado = prestado;
    }

    /**
     * Metodos getter y setter variables privadas
     */
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public boolean isPrestado() {
        return Prestado;
    }

    public void setPrestado(boolean prestado) {
        this.Prestado = prestado;
    }

    //Metodo para prestar libro
    public void prestamo(int opcion) {
        if (opcion == 1) {
            this.Prestado = true;
        } else if (opcion == 2) {
            this.Prestado = false;
        } else {
            System.out.println("Ingrese una opcion correcta");
        }
    }

    /**
     * Metodo para devolver libro
     */
    public void devolver() {
        this.Prestado = false;
    }

    /**
     * Metodo informacion del libro
     */
    public void mostrarInformacion() {
        System.out.println("\n");
        System.out.println("Informacion del libro");
        System.out.println("El nombre del libro es: " + this.Nombre);
        System.out.println("El anio de publicacion es: " + this.anioPublicacion);
        System.out.println("El autor es: " + this.Autor);
        if (this.Prestado == false) {
            System.out.println("EL libro está disponible");
        } else if (this.Prestado == true) {
            System.out.println("El libro está prestado");
        }
    }

}