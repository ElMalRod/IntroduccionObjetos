package src;

/**
 *
 * @author emili
 */
//Clase Cuadrado que se encuentra dentro de paquete src
public class Cuadrado {

    // Variables
    private int base;
    private int altura;
    private int area;
    private int perimetro;

    //Constructor que pide como parametros los valores enteros de base y altura
    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

   /**
     * Metodos getter y setter variables privadas
     */
    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    /**
     * Metodos para calcular el area y el perimetro del cuadrado
     */
    public void area() {
        this.area = this.base * this.altura;
    }

    public void perimetro() {
        this.perimetro = this.base + this.altura + this.base + this.altura ;
    }

}