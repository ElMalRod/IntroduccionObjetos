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
    }

    // Metodo Contador Usando las variables del Objeto y sus contructores
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

}