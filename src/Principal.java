package src;

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
    }

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
        Rectangulo rectangulo = new Rectangulo(20, 30);
        Rectangulo Aux = rectangulo;
        Aux.area();
        Aux.perimetro();
        System.out.println("El area del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());

    }

}