/*
 * Ejercicio Ejemplo Libro Array.java
 * 
 * usamos un array de cadenas de caracteres para
 * almacenar colores.
 *  String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
	El valor de color[0] sería rojo , el de color[1] sería amarillo , etc.
	El programa genera una bandera de colores aleatorios. Observa que se utiliza como
	índice (int)(Math.random() * 6) , que es un número aleatorio entre 0 y 5.
 * 
 */

import java.util.Scanner;
public class Array06GeneradorAleatorioDeBanderas {
		public static void main(String[] args) {
		String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
		System.out.println("Generador aleatorio de banderas");
			Scanner s = new Scanner(System.in);
			
		System.out.print("¿Cuántas franjas quiere para la bandera? ");
			int franjas = Integer.parseInt(s.nextLine());
			
		System.out.println("--------------");
		for (int i = 0; i < franjas; i++) {
			
		System.out.println(color[(int)(Math.random() * 6)]);
			System.out.println("--------------");
		}
	}
}

