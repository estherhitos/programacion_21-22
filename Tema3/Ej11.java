/*
 * Ejercicio 11 | tema 3.java
 * 
 * Realiza un conversor de Kb a Mb
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej11 {
	
	public static void main (String[] args) {
		
		double conversor = 1024;
		
		
		System.out.println("Conversión de KiB a MiB");
		System.out.println("introduce el valor a convertir: "); 
		double valor = Integer.parseInt(System.console().readLine());
		
		double resultado = valor/conversor;
		
		System.out.printf("El valor de %.0f MiB es  %.0f KiB",valor,resultado);
		
		
	}
}

