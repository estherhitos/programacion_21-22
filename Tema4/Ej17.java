/*
 * Ej17 | tema4
 * 
 * Escribe un programa que diga cuál 
 * es la última cifra de un número entero 
 * introducido por teclado.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej17 {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce un numero sin decimales superior al 10 porfabor: ");
		int numfinal = Integer.parseInt(System.console().readLine());
		System.out.println("El ultimo digito del numero introducido es : "+(numfinal % 10));
	}
}
