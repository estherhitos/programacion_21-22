/*
 * ej6|T4.java
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un
 *    objeto desde una altura h.
 *    t = raiz(2h/g) siendo g = 9.81 m/s2   (g=gravedad)
 * 
 * @authora Esther Hitos Garcia
 */

import java.util.*;
public class Ej6{
	public static void main (String[] args) {
		 
		double g = 9.81;//LAS CONSTANTES SE DECLARAN CON final ¿pero no me lo coge?//¿porque?
		
		System.out.print("¡¡Calculemos lo que tarda en caer un objeto!!\n");
		System.out.println("Introduce la altura de donde se a caido el objeto: ");
		 Double h = Double.parseDouble(System.console().readLine());
		
		 double t = Math.sqrt((2 * h)/g);
		  //La función Math.sqrt((2*h/g)) retorna la raíz cuadrada de un número													
		System.out.printf("Desde la altura "+h+" Metros, tarda %.2f segundos en caer.\n",+t);
	}
}

