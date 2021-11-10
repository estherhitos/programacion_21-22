/*
 * EjEXA1.java
 * 
Implemente un programa que calcule el número de vueltas que ha girado el planeta Tierra durante
una cantidad de años pedida interactivamente al usuario. El programa debe soportar cantidades de años “muy
elevadas”. No es necesario considerar los años bisiestos, se considera que todos los años tienen 365 días.
 *  * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 */


public class EjEXA1 {
	
	public static void main (String[] args) {
		int anos;
		long numeroVueltas;
		
		System.out.print("Introduzca el número de años: ");
		anos= Integer.parseInt(System.console().readLine());
		
		numeroVueltas = (long)años * 365;
		
		System.out.println("En ese tiempo, la Tierra ha dado "+numeroVueltas+ " vueltas sobre sí misma.");
		
	}
}

