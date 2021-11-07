/*
 * Ej16Primo | Tema 5.java
 * 
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 * 
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * El primer número primo es 2, y hay 25 números primos entre 1 y 100, 
 * ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
 * 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 * @Authora: Esther Hitos Garcia
 * 
 */


public class Ej16Primo {
	
	public static void main (String[] args) {
		
		int numero;
		boolean primo = true;
		
		System.out.print("Introduce un numero y te dire si es primo o no ");
		numero = Integer.parseInt(System.console().readLine());
		
		
		 // El 0, 1 y 4 no son primos
			if (numero == 0 || numero == 1 || numero == 4) {
			primo = false;
			}
			for (int i = 2; i < numero / 2; i++) {
				
		    // Si es divisible por cualquiera de estos números, no es primo
			  if (numero % i == 0){
        primo = false;
			  }
			 } 
			// Si no se pudo dividir por ninguno de los de arriba, sí es primo
			
			if(primo){
			System.out.print("SI es primo");
				}else{
					System.out.print("NO es primo");
				}
	}
		
}


