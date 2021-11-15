/*
 * Ejercicio 23 | Tema 5.java
 * 
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej23 {
	
	public static void main (String[] args) {
		
		int numMax=10000;
		int contador =0;
		int suma=0;
		
		System.out.println("Vaya introduciendo una serie indeterminada de números");
		System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
		
		do{
			int numeroInt=Integer.parseInt(System.console().readLine());
			suma+=numeroInt;
			contador++;
			}while (suma <=numMax);
		
		System.out.println("Ha introducido un total de " + contador + " números.");
		System.out.println("La suma total es " + suma + ".");
		System.out.println("La media es " + suma / contador + ".");
		
	}
}

