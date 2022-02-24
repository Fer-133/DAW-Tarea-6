package clases;

/**
 * Esta clase nos permite crear triangulos
 * @author Fernando Cañada Bastias
 * @version 1.0
 */
public class Triangulo extends Figura{
    
    //Atributos
    /**
     * Base del triangulo
     */
    private double base;

    /**
     * Altura del triangulo
     */
    private double altura;

    //Metodos
    /**
     * Calcula el area del triangulo
     * @return El area del triangulo
     */
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }

    /**
     * Devuelve la base del triangulo
     * @return La base del triangulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece la base del triangulo
     * @param base La base del triangulo
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Devuelve la altura del triangulo
     * @return La altura del triangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triangulo
     * @param altura La altura del triangulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
