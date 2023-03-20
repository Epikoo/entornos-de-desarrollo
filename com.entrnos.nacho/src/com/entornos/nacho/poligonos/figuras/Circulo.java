package com.entornos.nacho.poligonos.figuras;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Nacho
 * 
 * @version 1.0
 * 
 * Representa un circulo. Contiene constructores para crear un circulo con un
 * radio aleatorio entre 1 y 10 y otro constructor para crearlo con un radio
 * dado. Contiene metodos para calcular area y perimetro.
 */

public class Circulo {
	int radio;

	/**
	 * Crea un circulo con un valor de radio aleatorio entre 1 y 10.
	 * 
	 * @see java.util.Random
	 */
	public Circulo() {

		Random numAl = new Random();
		this.radio = numAl.nextInt(10) + 1;

	}

	/**
	 * Crea un circulo con un valor dado por parametro.
	 * 
	 * @param radio Indica el tamano del radio
	 */
	public Circulo(int radio) {

		this.radio = radio;

	}
	/**
	 * Calcula el area del circulo
	 * @return el area del circulo en decimal
	 */
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	/**
	 * Calcula el perimetro del circulo con casteo a int
	 * @return devuelve el perimetro en entero
	 */
	public int perimetro() {
		return (int)(2*Math.PI*this.radio);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	/**
	 * Devuelve el radio
	 * @return radio
	 */

	public int getRadio() {
		return radio;
	}
	/**
	 * Establece el radio
	 * 
	 */

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
}