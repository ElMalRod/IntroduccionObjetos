package src;

import java.util.Scanner;

/**
 *
 * @author emili
 */
//Clase Rectangulo que se encuentra dentro de paquete src
public class Rectangulo {
    // Variables

    Scanner sc = new Scanner(System.in);
    private int base;
    private int altura;
    private int area;
    private int perimetro;
    //Constructor que pide como parametros los valores enteros de base y altura

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        System.out.println("Ingrese Ancho: ");
        base = sc.nextInt();
        System.out.println("Ingrese Altura: ");
        altura = sc.nextInt();
        this.base = base;
        this.altura = altura;
        if (altura == base) {
            System.out.println("Los datos forman un cuadrado , debe ser un rectangulo");
        } 
    }

    /**
     * Metodos getter y setter variables privadas
     */
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
      /**
     * Metodos para calcular el area y el perimetro del cuadrado
     */
    public void area() {
        this.area = this.base * this.altura;
    }

    public void perimetro() {
        this.perimetro = (this.base * 2) + (this.altura * 2);
    }

}
