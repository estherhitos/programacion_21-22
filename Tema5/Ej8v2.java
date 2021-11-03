/*
 * Ej8v2.java
 * 
Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 */


public class Ej8v2 {
	
	public static void main (String[] args) {
		int multiplicador;
		int i=0;
		
		System.out.println("QUÉ TABLAS DE MULTIPLICAR QUIERES?");
		System.out.print("Introduce el numero multiplicador: ");
		multiplicador=Integer.parseInt(System.console().readLine());
		
		while(i <= 10) {
				i+=1;
			
			System.out.println(multiplicador+ " X " +i+ " = "+multiplicador*i);
		}
	}


}
