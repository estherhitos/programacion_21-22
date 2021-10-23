/*
 * Ejercicio 10 | tema 3.java
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 * 1 KB = 1000
 * 
 * 1KiB = 1024
 * 
 * @Authora: esther Hitos Garcia
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		double conversor = 1000;
		
		
		System.out.println("Conversion de MB a KB");
		System.out.println("introduce el valor a convertir: "); 
		double valor = Integer.parseInt(System.console().readLine());
		
		double resultado = valor*conversor;
		
		System.out.printf("El valor de %.0f MB es  %.0f KB",valor,resultado);
		
		
	}
}

