/*
 * Ejercicio 18 | Tema5.java
 * 
Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej18 {
	
	public static void main (String[] args) {
		
		int numUno;
		int numDos;
		
		System.out.println("Incrementando de 7 en 7 con dos numeros que introduzcas");
		do{
		System.out.println("Introduce el primer numero: ");
		numUno= Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduce el segundo numero (distinto al primero): ");
		numDos= Integer.parseInt(System.console().readLine());
		
		if (numUno == numDos){
			System.out.println("Son iguales!! no sirve");
			}
		}while (numUno == numDos);
			if (numUno > numDos){
				int x = numUno;
				numUno = numDos;
				numDos = x;
				}	
		for (int i = numUno; i<=numDos; i+=7){
			System.out.print(i+" ");
			}
			System.out.println();
	}

}
