/*
 * Ej10ArraysParesImparesPosiciones.java
 * 
 *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 *almacene en un array. El programa debe ser capaz de pasar todos los números pares a
 *las primeras posiciones del array (del 0 en adelante) y todos los números impares a
 *las celdas restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * 
 */


public class Ej10ArraysParesImparesPosiciones {
	
	public static void main (String[] args) {
		
		int[] n = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int i;
		int pares = 0;
		int impares = 0;
		
		for (i = 0; i < 20; i++) {
			n[i] = (int)(Math.random() * 101);
														
			if (n[i] % 2 == 0) {		// Separa los números metiendo los pares en un array
					par[pares++] = n[i];// y los impares en otro.
				} else {
					impar[impares++] = n[i];
			}
		}
		// Muestra el array original
		System.out.println("Array original:");
		for (i = 0; i < 20; i++) {
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		
		// Mete los pares en las primeras posiciones
		// del array original.
		for (i = 0; i < pares; i++) {
			n[i] = par[i];
		}
		
		// Mete los impares en los huecos que quedan.
		for (i = pares; i < 20; i++) {
			n[i] = impar[i - pares];
		}
		
		// Muestra el resultado.
		System.out.println("Array con los pares al principio:");
		for (i = 0; i < 20; i++) {
			System.out.print(n[i] + " ");
		}
	}
}

