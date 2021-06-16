package src;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal principal = new Principal();

    }

    public Principal() {
        ContadorEje1();
        System.out.println("--------------------------------");
        CuadradoEje2();
        System.out.println("--------------------------------");
        CirculoEje3();
        System.out.println("--------------------------------");
        RectanguloEje4();
        System.out.println("--------------------------------");
        LibroEje6();
        System.out.println("--------------------------------");
        FraccionEje7();
    }
    Scanner sc = new Scanner(System.in);

    public void ContadorEje1() {
        Contador contador = new Contador(1);

        Contador Aux = contador;
        System.out.println("Contador inicial: " + contador.getContador());
        Aux.setContador(10);
        System.out.println("Contador Auxiliar: " + contador.getContador());
        contador.ContadorMas();
        System.out.println("El numero del contador se incremento: " + contador.getContador());
        contador.ContadorMenos();
        contador.ContadorMenos();
        System.out.println("El numero del contador se decremento: " + contador.getContador());
    }

    public void CuadradoEje2() {
        Cuadrado cuadrado = new Cuadrado(1, 1);

        Cuadrado Aux = cuadrado;
        System.out.println(" Base: " + cuadrado.getBase() + "  Altura: " + cuadrado.getAltura());
        Aux.setBase(50);
        Aux.setAltura(30);
        System.out.println("Los valores nuevos son: ");
        System.out.println(" Base: " + cuadrado.getBase() + "  Altura: " + cuadrado.getAltura());
        Aux.area();
        Aux.perimetro();
        System.out.println("El area del cuadrado es: " + cuadrado.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());
    }

    public void CirculoEje3() {
        Circulo circulo = new Circulo(1);
        Circulo Aux = circulo;
        System.out.println("Radio: " + circulo.getRadio());
        Aux.setRadio(30.7);
        System.out.println("El valor nuevo es: ");
        System.out.println("Radio: " + circulo.getRadio());
        Aux.CalcularArea();
        Aux.CalcularPerimetro();
        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
    }

    public void RectanguloEje4() {
        Rectangulo rectangulo = new Rectangulo(1, 1);
        Rectangulo Aux = rectangulo;
        Aux.area();
        Aux.perimetro();
        System.out.println("El area del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());

    }

    public void LibroEje6() {
        int opcion = 0, opcion1 = 0;
        Libro libro = new Libro("Principito", 1951, "Antoine de Saint-Exupéry", false);
        Libro Aux = libro;
        libro.mostrarInformacion();
        System.out.println("\n");
        System.out.println("¿Deseas prestar el libro?");
        System.out.println("1) Si");
        System.out.println("2) No");
        opcion = sc.nextInt();
        Aux.prestamo(opcion);
        System.out.println("¿Deseas devolver el libro?");
        System.out.println("1) Si");
        System.out.println("2) No");
        opcion1 = sc.nextInt();
        if (opcion1 == 1) {
            Aux.devolver();
            libro.mostrarInformacion();
        } else {
            libro.mostrarInformacion();
        }

    }

    public void FraccionEje7() {
        Fraccion f1 = new Fraccion(1,7); // Fracción 1/4
        Fraccion f2 = new Fraccion(3,2); // Fracción 1/2
        Fraccion f3 = new Fraccion(); // Fracción 0/1
        Fraccion f4 = new Fraccion(4); // Fracción 4/1
        // operaciones aritméticas con esas fracciones
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);
        //mostrar resultados
        System.out.println("SUMA");
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println("RESTA");
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println("MULTIPLICAICON");
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println("DIVISION ");
        System.out.println(f1 + " / " + f2 + " = " + cociente);
    }

}
