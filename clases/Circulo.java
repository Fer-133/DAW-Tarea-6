package clases;

import clases.Figura;
/**
 * Esta clase nos permite crear circulos
 * @author Fernando Cañada Bastias
 * @version 1.0
 */
public class Circulo extends Figura{
    
    //Atributos
    /**
     * Constante PI
     */
    final double pi=3.1416;
 
    /**
     * Radio del circulo
     */
    private double radio;
    
    //Metodos
    /**
     * Calcula el area del circulo
     * @return El area del circulo
     */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
    
    /**
     * Devuelve el radio del circulo
     * @return El radio del circulo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del circulo
     * @param radio El radio del circulo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
