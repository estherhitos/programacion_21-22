/*
 * ejercicio1 | Tema1.java
 * 
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 * 
 * <= menor o igual que
 * >= mayor o igual que
 */


public class Ej1 {
	
	public static void main (String[] args) {
		
		// Listar los multiplos de un número
		// Multiplos de 5
		int n = 100;
		int x = 5;
		
			System.out.print("Los multiplos de " + x + " son\n");
		for (int i=0; i <=n; i++) {
	
				if (i %x == 0)
				System.out.println(i);

		}
	}
}		



