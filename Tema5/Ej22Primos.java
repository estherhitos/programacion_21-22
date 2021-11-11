/*
 * Ejercicio 22 | Tema 5.java
 * 
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 *El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 
 * 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 * 
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej22Primos {
	
	public static void main (String[] args) {
		
		
		System.out.println("Números primos entre 2 y 100: ");
		
		boolean primo = true;
		for (int n=2; n<=100; n++){ //inicio el conteo en 2 y la condicion tiene que ser menor e igual que 100
				primo = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
				primo = false;
				}
			}
			
			if (primo)
				System.out.print(" "+ n +" ");
		}
		System.out.println();
	
	}
}
	
