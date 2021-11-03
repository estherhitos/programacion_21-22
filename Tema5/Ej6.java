/*
 * Ejercicio 6 | Tema 5.java
 * 
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while .
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej6 {
	
	public static void main (String[] args) {
		
		int inicio = 320;
		
		System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
		
		do {
			System.out.println(inicio);
				inicio-=20;
		} while(inicio >= 160);
	}
}


