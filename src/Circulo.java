package src;

/**
 *
 * @author emili
 */
//Clase Circulo que se encuentra dentro de paquete src
public class Circulo {
    
     //Variables double 
     
    private double radio;
    private double area;
    private double perimetro;
    
    
    //  Constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    /**
     * Metodos getter y setter variables privadas
     */
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    /**
     * Metodos para calcular area y perimetro
     */
    public void CalcularArea(){
        this.area = (Math.PI)*(this.radio*this.radio);
    }

    public void CalcularPerimetro(){
        this.perimetro = (2*3.1416)*(this.radio);
    }
}