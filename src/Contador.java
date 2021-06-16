package src;

/**
 *
 * @author emili
 */
//Clase contador que se encuentra dentro de paquete src
public class Contador {

    private int contador = 0;
    // Constructor con parametros 

    public Contador(int Num) {
        this.contador = Num;
    }

    //Constructor
    public Contador() {
        this.contador = 19;
    }

    //Constructor copia, 
    public Contador(Contador contador) {
        this.contador = contador.getContador();
    }

    /**
     * Metodos getter y setter variables privadas
     */
    public void setContador(int numeroInicio) {
        this.contador = numeroInicio;
    }

    public int getContador() {
        return contador;
    }

    /**
     * Metodos para generar que el contador sume y reste
     */
    public void ContadorMenos() {
        contador--;
    }

    public void ContadorMas() {
        contador++;
    }

}