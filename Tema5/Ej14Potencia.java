/*
 * Ejercicio 14 | Tema 5.java
 * 
Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej14Potencia {
	
	public static void main (String[] args) {
		
		int expon;
		double base,result;
		
		 // Pedimos datos al usuario
    System.out.print("Introduce la base de la potencia: ");
    base = Double.parseDouble(System.console().readLine());
    
     do {
      System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
      expon = Integer.parseInt(System.console().readLine());
				if (expon <= 0) {
        System.out.println("Error, el exponente debe ser un entero positivo.");
				}
			}while (expon <= 0);
				result = base;
    //bucle para repetir la multiplicación de la base consigo misma hasta conseguir el resultado de la potencia.
    for (int i=1; i<expon;i++){
      result = (result*base);
    }
		// Mostramos el resultado
    System.out.println("El resultado de la potencia es: "+result);
	}
}

