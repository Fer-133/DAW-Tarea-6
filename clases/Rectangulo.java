package clases;

/**
 * Esta clase nos permite crear rectangulos
 * @author Fernando Cañada Bastias
 * @version 1.0
 */
public class Rectangulo extends Figura{
    
    //Atributos
    /**
     * Base del rectangulo
     */
    private double base;
    
    /**
     * Altura del rectangulo
     */
    private double altura;

    //Metodos
    /**
     * Calcula el area del rectangulo
     * @return El area del rectangulo
     */

    public double CalcularArea() {        
        return this.area=(base*altura);
     }

    /**
     * Devuelve la base del rectangulo
     * @return La base del rectangulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece la base del rectangulo
     * @param base La base del rectangulo
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Devuelve la altura del rectangulo
     * @return La altura del rectangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura del rectangulo
     * @param altura La altura del rectangulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
