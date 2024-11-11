/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 111124
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 111124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		double base, exponente, resultado;
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario por consola la base y el exponente
		System.out.println("Introduzca un número entero: ");
		base = sc.nextInt();
		System.out.println("Introduzca como número entero a cuánto lo quiere elevar: ");
		exponente = sc.nextInt();
		
		//Calculo el resultado
		resultado = potencia(base, exponente);
		
		//Muestro el resultado por consola
		System.out.println((int)base + " elevado a " + (int)exponente + " es igual a " + (int)resultado);

	}
	
	/**
	 * Método que elevará un número (base) a otro (exponente) y devolverá el resultado de la potencia
	 * rbr - 111124
	 * @param base
	 * @param exponente
	 * @return resultado
	 */
	public static double potencia(double base, double exponente) {
		
		double resultado;
		
		if(base==0) {
			return 1;
		}else {
			resultado = Math.pow(base, exponente);
			return resultado;
		}
		
	}

}
