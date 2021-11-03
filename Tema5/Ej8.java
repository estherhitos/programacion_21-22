/*
 * Ejercicio 8 | Tema 5.java
 * 
Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * 
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		int multiplicador;
		
		System.out.println("QUÉ TABLAS DE MULTIPLICAR QUIERES?");
		System.out.print("Introduce el numero multiplicador: ");
		multiplicador=Integer.parseInt(System.console().readLine());
		
		for (int i=1; i <=10; i++){
                System.out.println(multiplicador+ " X " +i+ " = "+multiplicador*i);
            }
            
		
	}
}

