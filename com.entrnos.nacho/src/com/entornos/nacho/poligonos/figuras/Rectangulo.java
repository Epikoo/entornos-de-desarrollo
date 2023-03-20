package com.entornos.nacho.poligonos.figuras;

import java.util.Random;

/**
 * 
 * @author Nacho
 * 
 * @version 1.0
 *
 */
public class Rectangulo {
	
    int altura;
    int anchura;

    /**
     * Crea un rectangulo con la altura y la anchura especificadas.
     *
     * @param altura    la altura del rectangulo
     * @param anchura   la anchura del rectangulo
     */
    public Rectangulo (int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }
    /**
     * Crea rectangulo con numeros aleatorios enteros como altura y anchura (Numeros entre 1 y 10).
     * @see java.util.Random
     */
    public Rectangulo () {
    	Random numeroAle = new Random();
    	this.altura=numeroAle.nextInt(10)+1;
    	this.anchura=numeroAle.nextInt(10)+1;
    	
    }
    
    

    /**
     * Devuelve el perimetro del rectangulo, es decir, la suma de todos los lados.
     *
     * @return  el perimetro del rectangulo
     */
    public int perimetro() {
        return altura*2 + anchura*2;
    }

    /**
     * Devuelve el area del rectangulo.
     *
     * @return el area del rectangulo
     */
    public int area() {
        return altura*anchura;
    }

}