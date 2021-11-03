/*
 * Ejercicio 5.java | Tema 5
 * 
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while .
 * 
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 * 
 */


public class Ej5 {
	
	public static void main (String[] args) {
		
		int i = 320;
		
		System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
			
		while(i >= 160) {
			System.out.println(i);
				i-=20;
			}
		
	}
}

