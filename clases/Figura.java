package clases;

/**
 * Esta clase nos va a servir como plantilla parar crear las clases de tipo Figura.
 * @author Fernando Cañada Bastias
 * @version 1.0
 */
public abstract class Figura {    
    
    //Atributos
    /**
     * El area de la figura
     */
	double area;

    //Metodos
    /**
     * Metodo abstracto donde se implementara el calculo del area de la figura
     */
    abstract public double CalcularArea();
    
}
