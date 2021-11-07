/*
 * Ejercicio 13 | Tema 5.java
 * 
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
* 
* 
* 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * 
 * @Authora: Esther hitos Garcia
 */


public class Ej13PositivoNegativo {
	
	public static void main (String[] args) {
		
		int n;
		int negativo= 0;
		int positivo= 0;
	
		
		
		
		System.out.println("Introduce 10 numeros plis: ");
			
			for (int i = 0; i < 10; i++) {
				n = Integer.parseInt(System.console().readLine());
           
           if (n < 0){  
           negativo++;
          }else {
          positivo++;
          }
				
			}
			
			System.out.println("Has introducido la cantidad de: "+positivo+" numeros positivos");
			
			System.out.println("Has introducido la cantidad de: "+negativo+" numeros negativos");
	}
}

